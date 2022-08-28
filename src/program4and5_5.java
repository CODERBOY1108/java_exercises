import java.util.Scanner;
public class program4and5_5 {
    void fact(){
        int i,fac=1,num;
        Scanner m=new Scanner(System.in);
        num=m.nextInt();
        for(i=1;i<=num;i++){
            fac=fac*i;
        }
        System.out.println("factoral of "+num+" is: "+fac);
    }
    void fab(){
        int n1=0,n2=1,n3,num;
        Scanner m=new Scanner(System.in);
        num=m.nextInt();
        System.out.print(n1+" "+n2);
        for(int i=2;i<num;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        System.out.println("do you want to find the factoral or fibonacci series: ");
        String choice=m.next();
       program4and5_5 obj=new program4and5_5();
        switch (choice) {
            case "factoral":
                System.out.println("enter the number to find the factoral of: ");
                obj.fact();
                break;
            case "fibonacci":
                System.out.println("enter the number of elements to print for fibonacci series: ");
                obj.fab();
                break;
            default:
                break;
        }
    }
}
