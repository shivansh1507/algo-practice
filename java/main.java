import java.util.*;
public class Main
{
    public static void main(String[] args)
    {  
        Scanner sc = new Scanner(System.in);
        int a,b,c,sum,avg;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sum = a+b+c;
        avg = sum/3;
        System.out.println(avg);
    }
}