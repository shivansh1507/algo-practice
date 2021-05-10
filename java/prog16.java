/**
5 
4 5 4 
3 4 5 4 3 
2 3 4 5 4 3 2 
1 2 3 4 5 4 3 2 1 
2 3 4 5 4 3 2 
3 4 5 4 3 
4 5 4 
5  
  
 */
import java.util.Scanner;

public class prog16
{
    public static void main(String[] args)
    {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed in the pattern ");

        int rows = scanner.nextInt();

        System.out.println("** Printing the pattern... **");

        for (int i = rows; i >= 1; i--)
        {
            for (int j = i; j <= rows; j++)
            {
                System.out.print(j + " ");//incremen
            }
            for (int k = rows-1; k >= i; k--)
            {
                System.out.print(k + " ");//rever
            }
            System.out.println();
        }
        for (int i = 2; i <= rows; i++)
        {
            for (int j = i; j <= rows; j++)
            {
                System.out.print(j + " ");//increme
            }
            for (int k = rows-1; k >= i; k--)
            {
                System.out.print(k + " ");//revers
            }
            System.out.println();
        }
    }
}