class A
{
A()
{
System.out.println("Constructor of Class A");
}
}
class B extends A
{
B()
{
System.out.println("Constructor of Class B");
}
}
class C extends B
{
C()
{
System.out.println("constructor of class c");
}
}
public class ConstructorDemo
{
public static void main(String args[])
{
System.out.println("creating object of class C");
C obj=new C();
}
}