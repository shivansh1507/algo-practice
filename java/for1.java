import java.util.*;
public class for1
{
public static void main(String[] args)
{ // Print a square that visualizes divisors.
Scanner sc = new Scanner(System.in);
int n;
n = sc.nextInt();
for (int i = 1; i <= n; i++) //i = 1
{ // Print the ith line.
for (int j = 1; j <= n; j++)// j = 1, j =2, j=3,j=4
{ // Print the jth element in the ith line.
if ((i % j == 0) || (j % i == 0))
System.out.print("* ");
else
System.out.print("# ");
}
System.out.println(i);
}
}
}

/*(i,j)
(1,1),(1,2),(1,3) 1
(2,1),(2,2),(2,3) 2
(3,1),(3,2),(3,3) 3*/

/* * * 
* * * 
* * */ 
