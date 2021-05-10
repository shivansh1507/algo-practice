/*
 1 2 3 4 5
  1 2 3 4
   1 2 3
    1 2
     1


*/
import java.util.Scanner;

public class prog5
{
	public static void main(String[] args)
	{
		// Create a new Scanner object
		Scanner scanner = new Scanner(System.in);

		// Get the number of rows from the user
		System.out.println("Enter the number of rows needed in the pattern ");

		int rows = scanner.nextInt();

		System.out.println("** Printing the pattern... **");
		for (int i = 1; i <= rows; i++)//2
		{
			for (int j = 1; j <= i ; j++)//1, 2  
			{
				System.out.print(" ");
			}
			int c = 1;

			for (int k = rows; k >= i; k--)//3,<=5,+1
			{
				System.out.print(c + " ");//1 2 3 4 5
				c++;
			}
			
			System.out.println();
		}
	}
}