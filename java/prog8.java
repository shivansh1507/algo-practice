import java.util.Scanner;
/*
    1 
   2 7 
  3 8 13 
 4 9 14 19 
5 10 15 20 25

*/
public class prog8
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
			int temp; 
			for (int k = i; k >= 1; k--) 
			{ 
				System.out.print(temp + " "); //1, 2 7,3 8 13
				temp = k + rows; //7+5=12
			}
			System.out.println();
		}
	}
}