import java.util.*;
public class cylinder{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        double h=sc.nextDouble();
        double volume=3.14*r*r*h;
        double surfacearea=3.14*r*h*2;
        System.out.println(volume);
        System.out.println(surfacearea);
    }
}