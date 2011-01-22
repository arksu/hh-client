/* this is part of arksu's script engine named hhl
* you can use it as is
* ENJOY!!! ))))
*/
package haven.hhl;

import haven.Config;
import haven.ark_bot;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

public class hhl_main {
 static hhl_thread thread = null;
 static int IncludeDepth = 0;
 public static SymbolTable symbols = null;

 public static void Init() {
  if (thread == null)
   thread = new hhl_thread();
 }

 public static void Start(String fname) throws Exception {
  Init();
     if (thread.isAlive())
      return;

     symbols = null;
     symbols = new SymbolTable();

     thread = null;
     thread = new hhl_thread();
     thread.fname = fname;
     thread.start();
 }

 public static void Stop( boolean need_print ) {
  Config.render_enable = true;
  if (need_print) ark_bot.SlenPrint("Script stopped!");
  try {
   if (thread != null)
    thread.stop();
  } catch (Exception e) {
   e.printStackTrace();
  }
 }

 public static void Sleep(int time) {
  try {
   thread.sleep(time);
  } catch (InterruptedException e) {
   e.printStackTrace();
  }
 }


 public static void PrintError(String msg) {
  System.out.println("HHL Error: "+msg);
 }

 public static void ParseScript(String fname) {
  try {
   IncludeDepth++;
   System.out.println("begin parse file'"+fname+"'...");
      File f = new File(fname);
      FileInputStream fis;
    fis = new FileInputStream(f);
      ANTLRInputStream input = new ANTLRInputStream(fis);
      hhlLexer lexer = new hhlLexer(input);
      TokenStream tokenStream = new CommonTokenStream(lexer);
      hhlParser parser = new hhlParser(tokenStream);
      hhlParser.start_return result = parser.start();
   CommonTree t = (CommonTree)result.getTree();
   System.out.println(t.toStringTree());
   CommonTreeNodeStream nodes;

   nodes = new CommonTreeNodeStream(t);
   func func_parser = new func(nodes);
   func_parser.program();

   nodes = new CommonTreeNodeStream(t);
   eval eval_parser = new eval(nodes);
   eval_parser.program();
   IncludeDepth--;

      System.out.println("parsed ok.");
  } catch (Exception e) {
   e.printStackTrace();
  }
 }

 public static void IncludeScript(String name) {
  System.out.println("including: "+name+"...");
  ParseScript("scripts\\"+name+".bot");
 }
}

class hhl_thread extends Thread {
 public String fname;

 public void run() {
  hhl_main.IncludeDepth = 0;
  hhl_main.ParseScript(fname);
  ark_bot.SlenPrint("Script FINISHED!");
 }
}
