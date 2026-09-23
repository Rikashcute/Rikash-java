class Dep{
	void run(){
System.out.println("Dep is ongoing");
}
}
class bca extends Dep{
void run(){
System.out.println("bca is ongoing course");
}
}
public class MethodOverriding{
public static void main(String[] args){
Dep d=new Dep();
d.run();
bca b=new bca();
c.run();
Dep obj=new bca();
obj.run();
}
}