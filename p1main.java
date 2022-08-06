import java.util.Scanner;
public class p1main
{
    public static void main(String[] args) {
        p1 a1 = new p1();
        System.out.print("Enter the  Radius -> ");
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        p1 a2 = new p1(d);
        System.out.println("Area of Circle for default argument 1: " +a1.getArea());
        System.out.println("Perimeter of circle for default argument 1:"+a1.getPerimeter());
        System.out.println("Area of Circle for argument:"+d+":" +a2.getArea());
        System.out.println("Perimeter of Circle for argument:"+a2.getPerimeter());
        System.out.println("Program done by 21CE098 MANTHAN PATEL");
    }
}
