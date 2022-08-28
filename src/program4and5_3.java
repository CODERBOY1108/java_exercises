import java.util.Scanner;
class area{
    int a;
    int square(int l){
        a=l*l;
        return a;
    }
    int rectangle(int l, int h){
        a=l*h;
        return a;
    }
    int triangle(int l, int h){
        a=(l*h)/2;
        return a;
    }
}
public class program4and5_3{
    public static void main(String[] args) {
        String shape;
        int l,h;
        Scanner m = new Scanner(System.in);
        System.out.print("enter the shape(square,triangle or rectangle): ");
        shape=m.next();
        area obj=new area();
        switch (shape) {
            case "square":
                System.out.print("enter the length of the square: ");
                l=m.nextInt();
                System.out.println("area of square is: "+obj.square(l));
                break;
            case "triangle":
                System.out.print("enter the breadth and height of triangle: ");
                l=m.nextInt();
                h=m.nextInt();
                System.out.println("area of triangle is: "+obj.triangle(l, h));
                break;
            case "rectangle":
                System.out.print("enter the lenght and breadth of the rectangle: ");
                l=m.nextInt();
                h=m.nextInt();
                System.out.println("area of rectangle is: "+obj.rectangle(l, h));
                break;
            default:
                break;
        }
        m.close();
    }
}
