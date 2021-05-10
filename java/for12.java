/*Prints out the sum s = 1/1 + 1/4 + 1/9 + 1/16 + ...
 *  The series sums to pi^2 / 6 so sqrt(6 s) should be an approximation
 *  to pi = 3.1415926535897932384626.*/
public class for12 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        double sum = 0.0;
        for (int i = 1; i <= n; i++) {      
            sum += 1 / (1.0 * i * i);     // good - multiply by 1.0 to cast to double
            // sum += 1.0 / (i * i);      // bad  - overflow if n > 65,535
            // sum += 1 / (i * i);        // bad  - integer division
            // sum += 1.0 / i * i;        // bad  - computes (1.0 / i) * i
        }
        System.out.println(sum);
        System.out.println(Math.sqrt(6.0 * sum));
    }
}