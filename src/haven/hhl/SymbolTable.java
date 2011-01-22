/* this is part of arksu's script engine named hhl
* you can use it as is
* ENJOY!!! ))))
*/
package haven.hhl;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import haven.ark_bot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import java.util.Map;

public class SymbolTable {
 List<Function> functions = new ArrayList<Function>();

 Vector scopes;
 Vector frames = new Vector();

 public HashMap globals = new HashMap();
 public List<String> ShowNames = new ArrayList<String>();
 String reserved_words[] = { "do_click" };

 public SymbolTable() {

 }

 public static void DebugLog(String msg) {
  System.out.println(msg);
 }

 public void reset_globals() {
  globals = new HashMap();
  ShowNames = new ArrayList<String>();
  scopes = null;
  frames = new Vector();
 }

 int max_var_num = 0;
 int max_label_num = 0;

 public int next_label() {
  max_label_num++;
  return max_label_num;
 }

 public int next_var() {
  max_var_num++;
  return max_var_num;
 }

 public void declare_function(String name, String return_type,
   Vector params, CommonTree pointer) {
  if ((hhl_main.IncludeDepth > 1) && (name.equals("main")))
   return;

  for (int i = 0; i < reserved_words.length; i++) {
   if (name.equals(reserved_words[i])) {
    hhl_main.PrintError("Try to declare reserved function! " + name);
    return;
   }
  }
  Function f = get_function(name, params);
  if (f != null) {
   hhl_main.PrintError("Function already declared! " + name);
   return;
  }
  functions.add(new Function(name, return_type, params, pointer));
  DebugLog("declare function name='" + name + "' return_type="
    + return_type);
 }

 public void enter_block() {
  scopes.add(new HashMap());
 }

 public void exit_block() {
  scopes.remove(scopes.size() - 1);
 }

 public void enter_frame() {
  scopes = new Vector();
  frames.add(scopes);
  scopes.add(new HashMap());
 }


 public void enter_frame(Function fcn, Vector params) {
  DebugLog("enter func name='" + fcn.name + "' params count="
    + params.size());
  enter_frame();

  for (int i = 0; i < fcn.params.size(); i++) {
   FunctionParam p = (FunctionParam) fcn.params.get(i);
   if (p.mode == "scalar") {
    declare_variable(p.name, p.type, true);
    if (params.get(i) instanceof Variable)
     set_value(p.name, ((Variable) params.get(i)).value, true);
    else
     set_value(p.name, (Integer) params.get(i), true);
   } else {
    reference_variable(p.name, (Variable) params.get(i));
   }
  }
 }

 public void exit_frame() {
  frames.remove(frames.size() - 1);
  if (frames.size() > 0) {
   scopes = (Vector) frames.get(frames.size() - 1);
  }
 }

 public Function get_function(String name, Vector params) {
  boolean params_matched;
  for (int i = 0; i < functions.size(); i++) {
   Function f = functions.get(i);
   if ((f.name.equals(name)) && (f.params.size() == params.size())) {
    params_matched = true;
if (params_matched)
     return f;
   }
  }
  return null;
 }

 public Variable get_variable(String name) {
  if (scopes != null) {
   for (int i = (scopes.size() - 1); i >= 0; i--) {
    Map vars = (Map) scopes.get(i);
    Variable v = (Variable) vars.get(name);
    if (v != null) {
     return v;
    }
   }
  }
  Variable v = (Variable) globals.get(name);
  if (v != null) {
   return v;
  }
  hhl_main.PrintError("Undeclared variable '" + name + "'");
  return null;
 }

 public void test_declared(String name) {
  is_declared(name);
 }

 public void test_assign(String name) {
  Variable v = get_variable(name);
  if (v != null && v.read_only) {
   hhl_main.PrintError("Attempted to assign a value to the read only variable '"
     + name + "'");
  }

 }

 public boolean is_declared(String name) {
  Variable v = get_variable(name);
  return v != null;
 }

 public int get_value(String name) {
  if (name.equals("HourGlass")) {
   return ((ark_bot.HourGlass) ? 1 : 0);
  } else if (name.equals("DraggingItem")) {
   return ((ark_bot.HaveDragItem()) ? 1 : 0);
  } else if (name.equals("Hungry")) {
   return ark_bot.Hungry;
  } else if (name.equals("HP")) {
   return ark_bot.HP;
  } else if (name.equals("Stamina")) {
   return ark_bot.Stamina;
  } else if (name.equals("PlayerID")) {
   return ark_bot.PlayerID;
  } else if (name.equals("Moving")) {
   if (ark_bot.mapview != null)
    return ((ark_bot.mapview.player_moving) ? 1 : 0);
   else
    return 0;
  } else if (name.equals("ContextMenuReady")) {
   return ((ark_bot.isFlowerMenuReady()) ? 1 : 0);
  } else if (name.equals("CraftReady")) {
   return ark_bot.is_craft_ready();
  } else if (name.equals("BuildReady")) {
   return (ark_bot.HaveBuildWindow())?1:0;
  } else {
   Variable v = get_variable(name);
   if (v != null) {
    if (v.mode.equals("scalar")) {
     return v.get_value();
    }
   }
   return -1;
  }
 }

 public int get_value(String name, Integer index) {
  Variable v = get_variable(name);

  if (v != null) {
   return v.get_value(index);
  }

  return -1;
 }

 public void set_value(String name, Integer value, Boolean force) {
  if (is_reserved(name)) {
   hhl_main.PrintError("name is reserved! " + name);
   return;
  }
  Variable v = get_variable(name);
  DebugLog("set value var name='" + name + "' type='" + v.type
    + "' value=" + value);
  if (v != null) {
   if (force) {
    v.force_set_value(value);
   } else {
    v.set_value(value);

   }
  }
 }

 public void set_value(String name, Integer value) {
  if (is_reserved(name)) {
   hhl_main.PrintError("name is reserved! " + name);
   return;
  }
  Variable v = get_variable(name);
  DebugLog("set value var name='" + name + "' type='" + v.type
    + "' value=" + value);
  if (v != null) {
   v.set_value(value);
  }
 }

 public void set_value(String name, Integer value, Integer index) {
  if (is_reserved(name)) {
   hhl_main.PrintError("name is reserved! " + name);
   return;
  }
  Variable v = get_variable(name);
  DebugLog("set value var name='" + name + "' type='" + v.type
    + "' index=" + index + "value=" + value);
  if (v != null) {
   v.set_value(value, index);
  }
 }

 public void declare_variable(String name, String type) {
  declare_variable(name, type, false);
 }

 public void declare_variable(String name, String type, Boolean read_only) {
  DebugLog("declare var name='" + name + "' type='" + type + "' ro="
    + read_only);
  if (is_reserved(name)) {
   hhl_main.PrintError("name is reserved! " + name);
   return;
  }
  Map vars = get_vars();
  Variable v = (Variable) vars.get(name);
  if (v != null) {
   hhl_main.PrintError("Variable '" + name + "' already declared");
  } else {
   vars.put(name, new Variable(name, type, next_var(), read_only));
  }
 }

 private Map get_vars() {
  Map vars;
  if (scopes == null) {
   vars = (Map) globals;
  } else {
   vars = (Map) scopes.get(scopes.size() - 1);
  }
  return vars;
 }

 public void declare_array(String name, String type, Integer size) {
  DebugLog("declare var name='" + name + "' type='" + type + "' size="
    + size);
  if (is_reserved(name)) {
   hhl_main.PrintError("name is reserved! " + name);
   return;
  }
  Map vars = get_vars();
  max_var_num++;

  Variable v = (Variable) vars.get(name);
  if (v != null) {
   hhl_main.PrintError("Variable '" + name + "' already declared");
  } else {
   vars.put(name, new Variable(name, type, size, max_var_num));
  }
 }

 public void reference_variable(String name, Variable v) {
  Map vars = get_vars();
  v.name = name;
  vars.put(name, v);
 }

 public boolean is_reserved(String name) {
  for (int i = 0; i < reserved_words.length; i++)
   if (name.equals(reserved_words[i]))
    return true;
  return false;
 }
}
