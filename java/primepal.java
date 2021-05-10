import java.io.*;
import java.util.*;
class primepal
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int n,p,rev,s=0,i,c=0;
        System.out.println("Enter No.");
        n= in.nextInt(); // Input number from user
        p=n; // store the entered number in "p" variable
        for(i=1;i<=p;i++)
        {
            if(p%i==0)
            {
                c++;//counters or flags
            }
        }
        while(n>0)
        {
            rev=n%10; // extract last digit of the number
            s=s*10+rev; // store the digit last digit
            n=n/10; // extract all digit except the last
        }
        if(p==s&&c==1) // comparing with original number
        {
            System.out.println("Number is PalPrime : "+p);
        }
        else
        {
            System.out.println("Number is not PalPrime : "+p);
        }
    } // end of main method
} // end of class
