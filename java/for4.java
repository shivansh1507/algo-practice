/*
             1
           1   1
         1   2   1
       1   3   3   1
     1   4   6   4   1
 */
import java.util.Scanner;
 
public class for4
{            
    public static void main(String[] args) {
          
        int n = 10;
  
        for (int i = 0; i < n; i++) //i = 2
        { 
            int number = 1;
            System.out.printf("%" + (n - i) * 2 + "s", "");//%6s
            for (int j = 0; j <= i; j++) { //j= 2
                System.out.printf("%4d", number); //1
                number = number * (i - j) / (j + 1);// 2 * (2-1)/1+1 = 1
                        }
            System.out.println();
        }
  
    }
  
}
 