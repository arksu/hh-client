/* this is part of arksu's script engine named hhl
* you can use it as is
* ENJOY!!! ))))
*/
package haven.hhl;

public class Variable {
 public String name;
 public String type;
 public String mode;
 public Boolean initiated;
    public Boolean read_only=false;
 public Integer value;
 public int[] values;
    public int num;
    public int length;


 public Variable(String n, String t, int mnum){
  name=n;
  type=t;
  mode="scalar";
  initiated=false;
  num = mnum;
 }

 public Variable(String n, String t, int mnum, boolean ro){
     this(n,t,mnum);
        read_only=ro;
    }

 public Variable(String n, String t, Integer size, int mnum){
  name=n;
  type=t;
  mode="array";
  values=new int[size];
  initiated=true;
        num=mnum;
        length=size;
 }
 public int get_value(){

  if (initiated){
   return value;
  }else{
   hhl_main.PrintError("Uninitialized variable '"+name+"'");
   return -1;
  }
 }
 public int get_value(Integer i){
  return values[i];
 }
 public void force_set_value(Integer v){
  value=v;
  initiated=true;
 }
 public void set_value(Integer v){
        if(read_only){
         hhl_main.PrintError("Tried to assign to a read only variable '"+name+"'");
        }
        force_set_value(v);
 }
 public void set_value(Integer v, Integer i){
  values[i]=v;
 }
}
