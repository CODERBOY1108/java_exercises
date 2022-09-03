package practise;
class rajat {
public void m1()
{
System.out.println("First case");
}
public void m1(int i)
{
System.out.println("Second case");
}
public void m1(String s)
{
System.out.println("Third case");
}
}
public class program6and7_5 {
public static void main(String[] args)
{ rajat m = new rajat();
m.m1("B");
}
}