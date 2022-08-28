import java.util.Scanner;
public class program2 {
    public static void main(String[] args)
    {
    	System.out.println("enter your marks");
    	Scanner sc=new Scanner(System.in);
    	int marks=sc.nextInt();
    	if(marks>=90)
    	{	System.out.println("excellent: grade A");
    	}
    	else if(marks>=80 && marks<90)
    	{
    		System.out.println("very good: grade B");
    	}
    	else if(marks>=70 && marks<80)
    	{
    		System.out.println("good:grade C");
    	}
    	else if(marks>=60 && marks<70)
    	{
    		System.out.println("Satisfactory:grade D");
    	}
    	else if(marks>=50 && marks<60)
    	{
    		System.out.println("work harder:grade E");
    	}
    	else if(marks>=40 && marks<50)
    	{
    		System.out.println("just passed:grade F");
    	}
    	else 
    	{
    		System.out.println("Failed");
    	}
    }
}
