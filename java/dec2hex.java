import java.util.Scanner;
public class dec2hex
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter decimal number ");
        int dec = in.nextInt();
        String hex = " ";
        while(dec!=0)
        {
            int hexV = dec%16;
            System.out.println(hexV);
            System.out.println("");

            char hexD = (hexV <= 9 && hexV >= 0) ? (char)(hexV + '0') : (char)(hexV - 10 + 'A');//13 - 10 + A = A+3=D
            System.out.println(hexD);
            hex = hexD + hex;
            System.out.println(hex);
            System.out.println("*****");
            dec = dec/16;
        }
        System.out.print("The hex number is "+ hex);
    }
}