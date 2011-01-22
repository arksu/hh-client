/* this is part of arksu's script engine named hhl
* you can use it as is
* ENJOY!!! ))))
*/
package haven.hhl;

import java.util.Vector;
import org.antlr.runtime.tree.*;

public class Function {
 public Vector<FunctionParam> params;
 public CommonTree tree;
 public String name;
 public String return_type;

 public Function(String n, String r, Vector<FunctionParam> my_params, CommonTree my_tree){
  name=n;
  return_type=r;
  params=my_params;
  tree=my_tree;
 }
}
