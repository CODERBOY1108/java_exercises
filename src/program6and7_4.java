package practise;
import java.util.Scanner;
class software{
public software()
{
try (Scanner s = new Scanner(System.in)) {
System.out.println("Enter the length of box:");
double l=s.nextDouble();
System.out.println("Enter the breadth of box:");
double b=s.nextDouble();
System.out.println("Enter height of box:");
double h=s.nextDouble();
double volume= l*b*h;
System.out.println("Volume Of box is:" +volume);
}
}
public void shipment()
{
System.out.println("Shipment detials:");
}
}
class Stark extends software{
public void brand()
{
System.out.println("Cargo value: 190M $");
}
}
public class program6and7_4 extends Stark{
	public program6and7_4()
	{
	System.out.println("Weight of the box is 50kg");
	}
	public void wt()
	{
	System.out.println("Cargo name: STARK EXPO");
	}
	public static void main(String args[])
	{
	program6and7_4 obj=new program6and7_4();
	obj.brand();
}
	}
	