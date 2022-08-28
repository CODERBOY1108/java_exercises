import java.util.Scanner;
public class program1_2 {

    public static void main(String args[]) {

        
        

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name =");
       String name = input.nextLine();

        System.out.println("Enter your class=");
        String clas = input.nextLine();

        System.out.println("Enter your subject = ");
        String subject = input.nextLine();

        System.out.println("Enter your marks = ");
        int marks = input.nextInt();

        System.out.println("Enter your age = ");
        int age = input.nextInt();

        System.out.println("Full Name = " + name);
        System.out.println("Class = " + clas);
        System.out.println("Subject = " + subject);
        System.out.println("Marks = " + marks);
        System.out.println("Age = " + age);
    }

}
