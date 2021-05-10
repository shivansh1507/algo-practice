/*
    A 
   A B 
  A B C 
 A B C D 
A B C D E 
*/
import java.util.Scanner;

public class prog18
{
    public static void main(String[] args)
    {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed in the pattern ");

        int rows = scanner.nextInt();

        System.out.println("** Printing the pattern... **");

        //int alphabet = 65;

        for (int i = 1; i <= rows; i++)///outer
        {
           int alphabet = 65;
            for (int j = rows; j > i; j--)//blank spaces
            {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++)
            {
                System.out.print((char)(alphabet + k) + " ");
            }
            System.out.println();
        }
    }
}