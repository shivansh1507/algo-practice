/*
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
*/
import java.util.Scanner;

public class prog3
{
    public static void main(String[] args)
    {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed in the pattern ");

        int rows = scanner.nextInt();

        System.out.println("** Printing the pattern... **");

        for (int i = 1; i <= rows; i++)// outer loops// i=2
        {
            for (int j = rows; j >= i; j--)//blank spaces//5,4,3
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)//i=2, k=1
            {
                System.out.print(i+" ");//1 2 
            }
            System.out.println();// new row
        }
    }
}