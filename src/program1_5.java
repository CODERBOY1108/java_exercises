import java.util.*;

public class program1_5 {

    public static void main(String args[]) {
        int i, j, n;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter no. of rows = ");
        n = input.nextInt();
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
