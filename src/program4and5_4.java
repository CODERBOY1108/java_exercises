import java.util.Scanner;
class room{
    // length, height, wall area, breadth, floor area
    void display(int l,int h,int w,int b,int f){
        System.out.println("lenght is: "+l);
        System.out.println("height is: "+h);
        System.out.println("wall area is: "+w);
        System.out.println("breadth is: "+b);
        System.out.println("floor area is: "+f);
    }
}
public class program4and5_4 {
    public static void main(String[] args) {
        int l,h,w,b,f;
        Scanner m=new Scanner(System.in);
        room obj=new room();
        System.out.println("enter the length, height, wall area, breadth and floor area: ");
        l=m.nextInt();
        h=m.nextInt();
        w=m.nextInt();
        b=m.nextInt();
        f=m.nextInt();
        obj.display(l, h, w, b, f);
        m.close();
    }
}
