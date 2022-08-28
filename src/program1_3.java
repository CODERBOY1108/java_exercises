import java.util.*;

class Employe {
    int wage, hr, totalWage, extraWg;
    String name;

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee name :- ");
        name = sc.nextLine();
        System.out.print("Enter No. of Hrs :- ");
        hr = sc.nextInt();
        System.out.print("Enter Wage per hrs :- ");
        wage = sc.nextInt();
    }

    void calcwg() {
        totalWage = wage * hr;
    }

    void extraWage() {
        if (totalWage < 200) {
            extraWg = 150;
            totalWage += extraWg;
        } else {
            extraWg = 50;
            totalWage += extraWg;
        }
    }

    void display() {
        System.out.println("----------Employee's Data is ------------");
        System.out.println("Employee name is :- " + name);
        System.out.println("Employee's Hrs per day is :- " + hr);
        System.out.println("Employee wage per hrs is :- " + wage);
        System.out.println("Employees extra wage is :- " + extraWg);
        System.out.println("Employees total wage is :- " + totalWage);
    }
}

public class program1_3 {
    public static void main(String args[]) {
        Employe ob = new Employe();
        ob.read();
        ob.calcwg();
        ob.extraWage();
        ob.display();
    }

}
