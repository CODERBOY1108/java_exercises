public class program3_4
{
public static void main(String args[]){
int org[]={45,55,67,89,50,23,52,12};
System.out.println("Printing original array:");
for(int i:org)
System.out.println(i);
System.out.println("Printing clone of the array:");
int copy[]=org.clone();
for(int i:copy)
System.out.println(i);
System.out.println("Are both equal?");
System.out.println(org==copy);
}
}