/*
    1 
   2 3 
  4 5 6 
 7 8 9 10 
11 12 13 14 15
*/

import java.util.Scanner;

public class prog6
{
    public static void main(String[] args)
    {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed in the pattern ");

        int rows = scanner.nextInt();

        System.out.println("** Printing the pattern... **");

        int count = 1;
        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j > i; j--)///
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}