/*
A number is said to be a magic number, if the sum of its digits are calculated till a single digit recursively by adding the sum of the digits after every addition. If the single digit comes out to be 1,then the number is a magic number.
For example-
Number= 50113
=> 5+0+1+1+3=10
=> 1+0=1
This is a Magic Number
For example-
Number= 1234
=> 1+2+3+4=10
=> 1+0=1
This is a Magic Number

*/

import java.util.*;
public class magic
{
    public static void main(String[] args)
    {
        int n, r = 1, num, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();//magic number input
        num = n;//temp
        while (num > 9)
        {
            while (num > 0)//521
            {
                r = num % 10;//5
                sum = sum + r;//1+2=3+5=8
                num = num / 10;//0
            }//terminate
            num = sum;
            sum = 0;
        }
        if (num == 1)
        {
            System.out.println("Magic Number");
        }
        else
        {
            System.out.println("Not Magic Number");
        }
    }
}