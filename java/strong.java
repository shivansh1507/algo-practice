/*
Strong Numbers are the numbers whose sum of factorial of digits is equal to the original number. Given a number, check if it is a Strong Number or not.

Examples:

Input  : n = 145
Output : Yes
Sum of digit factorials = 1! + 4! + 5!
                        = 1 + 24 + 120
                        = 145

*/

import java.util.*;
public class strong
{
public static void main(String[] args) {
int n,i;
int fact,rem;
Scanner sc = new Scanner(System.in);
System.out.print("\nEnter the number : ");
n = sc.nextInt();
int sum = 0;
int temp = n;
while(n != 0)
{
i = 1;
fact = 1;
rem = n % 10;

while(i <= rem)
{
fact = fact * i;
i++;
}
sum = sum + fact;
n = n / 10;
}

if(sum == temp)
System.out.println(temp + " is a strong number\n");
else
System.out.println(temp + " is not a strong number\n");

System.out.println();
}
}