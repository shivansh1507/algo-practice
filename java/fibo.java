import java.util.*;
public class fibo{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in); // Creates an object of Scanner class.
		int n = sc.nextInt(); // Asks for number of terms from the user.
		int firstTerm = 0, secondTerm = 1, fib = 0, count = 2; // Declared and initialized the variables temp and fact.
		if (n == 1)
		{
		  System.out.print(firstTerm);
		}
else if(n == 2)
{
  System.out.print(firstTerm + " " + secondTerm);
}
else if(n>=3)
		{ // Start of body of else if statement.
		System.out.print (firstTerm + " " + secondTerm);
		while (count < n) 
			{ // Start of body of while loop.
    				fib = firstTerm + secondTerm; // Each time add the last two term of the fibonacci sequence.
				firstTerm = secondTerm;
				secondTerm = fib; 
    				count = count + 1; // Increment the count variable.				
			        System.out.print(" " + fib); // Prints each term of fibonacci sequence.
			} // End of body of while loop.
		}// End of body of if statement.
else
System.out.println("Invalid number of terms");
					      } // End of method main.
		} // End of class Main.
