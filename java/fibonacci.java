/*  
 *  Prints out the first n Fibonacci numbers.
 *
 *  % java Fibonacci 8
 *  1
 *  1
 *  2
 *  3
 *  5
 *  8
 *  13
 *  21
 *  34
 *  55
 *
 ******************************************************************************/

public class fibonacci {

    public static void main(String[] args) { 
        int n = Integer.parseInt(args[0]);
        int f = 0, g = 1;

        for (int i = 1; i <= n; i++)
        {
            f = f + g;
            g = f - g;
            System.out.println(f);

        }
    }
}