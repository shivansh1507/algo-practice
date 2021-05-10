import java.util.Scanner;
/*
    1 
   1 1 
  1 2 1 
 1 3 3 1 
1 4 6 4 1 



*/
public class prog9
{
	public static void main(String[] args)
	{
		// Create a new Scanner object
		Scanner scanner = new Scanner(System.in);

		// Get the number of rows from the user
		System.out.println("Enter the number of rows needed in the pattern ");

		int rows = scanner.nextInt();

		System.out.println("** Printing the pattern... **");

		for (int i = 1; i <= rows; i++)
		{
			for (int j = rows; j > i; j--)
			{
				System.out.print(" ");
			}
			int temp = 1; 
			for (int k = 1; k <= i; k++) 
			{ 
				System.out.print(temp + " "); 
				temp = temp * (i - k) / (k);/// 
			}
			System.out.println();
		}
	}
}