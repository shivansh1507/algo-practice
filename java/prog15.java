/*
1 
2 4 
3 6 9 
4 8 12 16 
5 10 15 
6 12 
7
*/
import java.util.Scanner;

public class prog15
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
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}