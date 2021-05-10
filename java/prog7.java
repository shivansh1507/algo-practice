import java.util.Scanner;
/*
** Printing the pattern... **
    1 
   2 1 
  3 2 1 
 4 3 2 1 
5 4 3 2 1


*/
public class prog7
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
            for (int k = i; k >= 1; k--)//1, 2 1, 3 2 1
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}