/*
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5


*/
// alignment=center
//3 loops= 1 outer - setting upper limit, 2nd loop=printing blank spaces, 3rd loop=printing numbers
// nested for

import java.util.Scanner;

public class prog2
{
    public static void main(String[] args)
    {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed in the pattern ");

        int rows = scanner.nextInt();

        System.out.println("** Printing the pattern... **");

        for (int i = 1; i <= rows; i++)//no of rows for the given pyramid
        {
            for (int j = rows; j > i; j--)//5,4,3,2,
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)//5-1+1.5-2+1.5-3+1.5-2+1.5-4+1.5-5+1
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}