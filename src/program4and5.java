import java.util.Scanner;
public class program4and5 {
    int roll,numb;
    String name,add,course;
    public program4and5(){
        name="rajat sharma";
        course="bca";
        roll=21215061;
        numb=1234567890;
    }
    public program4and5(int r,int no,String na,String cou) {
        name=na;
        course=cou;
        roll=r;
        numb=no;
    }
    void print()
    {
        System.out.println("Name: "+name);
        System.out.println("Course: "+course);
        System.out.println("Roll no.: "+roll);
        System.out.println("Number: "+numb);
    }
    public static void main(String arg[])
    {
            program4and5 ob1=new program4and5();
            Scanner sc=new Scanner(System.in);
            int ro,num;
            String nam,co;
            System.out.println("Student 1:");
            System.out.print("Enter the name : ");
            nam=sc.next();
            System.out.print("Enter the course: ");
            co=sc.next();
            System.out.print("Enter the roll no.: ");
            ro=sc.nextInt();
            System.out.print("Enter the number: ");
            num=sc.nextInt();
            program4and5 ob2=new program4and5(ro,num,nam,co);
            System.out.println("Student 2:");
            System.out.print("Enter the name : ");
            nam=sc.next();
            System.out.print("Enter the course: ");
            co=sc.next();
            System.out.print("Enter the roll no.: ");
            ro=sc.nextInt();
            System.out.print("Enter the number: ");
            num=sc.nextInt();
            program4and5 ob3=new program4and5(ro,num,nam,co);
            System.out.println("Student 3:");
            System.out.print("Enter the name : ");
            nam=sc.next();
            System.out.print("Enter the course: ");
            co=sc.next();
            System.out.print("Enter the roll no.: ");
            ro=sc.nextInt();
            System.out.print("Enter the number: ");
            num=sc.nextInt();
            program4and5 ob4=new program4and5(ro,num,nam,co);
            ob1.print();
            ob2.print();
            ob3.print();
            ob4.print();
        sc.close();
    }
}
