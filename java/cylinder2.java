import java.util.*;
public class cylinder2{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of cylinder");
        double r=sc.nextDouble();
        System.out.println("Enter the height of cylinder");
        double h=sc.nextDouble();
        double sa=2*r*h*3.14;
        double v=3.14*r*r*h;
        System.out.println("surface area of cylinder"+sa);
        System.out.println("volume of cylinder"+v);
    }
}