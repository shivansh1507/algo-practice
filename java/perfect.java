/*A Perfect number is a positive integer that is equal to the sum of its proper divisors except itself.
Let’s take an easy example, such as 6.

1, 2, 3 and 6 are the divisors of 6. If we add up all the numbers except 6, we end with the sum of 6 itself.

1 + 2 + 3 = 6 = Perfect Number.
*/
import java.util.*;
class perfect
{
	public static void main(String arg[])	
	{
	    long n,sum=0;
             	    Scanner sc=new Scanner(System.in);	   	 
	    System.out.println("Enter a number");
                   n=sc.nextLong();
	    int i=1;
	    while(i < n)//
	    {
	       if(n%i==0)
	       {
		sum+=i;//summing divisors
	       }
	      i++;
	    }
	if(sum==n)
	{
	System.out.println(n+" is a perfect number");
               } 
	else
	System.out.println(n+" is not a  perfect number"); 
	}
}