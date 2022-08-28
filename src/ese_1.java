import java.util.Scanner;
public class ese_1 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your product name:");
	String nam=sc.nextLine();
	System.out.println("enter your company:");
	String company=sc.nextLine();
	System.out.println("enter your product NO.:");
	int num=sc.nextInt();
	System.out.println("enter the price");
	int price=sc.nextInt();
	
	System.out.println("Product name:"+nam);
	System.out.println("Product No.:"+num);
	System.out.println("Company:"+company);
	System.out.println("Price:"+price);
}
}
