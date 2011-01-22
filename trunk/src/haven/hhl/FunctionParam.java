/* this is part of arksu's script engine named hhl
* you can use it as is
* ENJOY!!! ))))
*/
package haven.hhl;

public class FunctionParam {
 public String name;
 public String type;
 public String mode;
    public int num;
    public boolean scalar;

 public FunctionParam(String n, String t, String s){
  name=n;
  type=t;
  mode=s;
        scalar=(mode.equals("scalar"));
 }

 public FunctionParam(String n, String t, String s, int number){
        this(n,t,s);
        num=number;
 }

 public FunctionParam(FunctionParam p, int number){
        this(p.name,p.type,p.mode);
        num=number;
 }
}
