/*
    1
   2 6
  3 7 10
 4 8 11 13
5 9 12 14 15

*/

import java.util.Scanner;

public class prog13
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
			int temp = i;
			for (int k = 1; k <= i; k++)// i = 3,k = 1,2
			{
				System.out.print(temp + " ");//3,7,
				temp = temp + rows - k;//7+5-2=10
			}
			System.out.println();
		}
	}
}