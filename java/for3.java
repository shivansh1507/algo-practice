import java.util.Scanner;
  
public class for3
{            
        public static void main(String[] args) {
            int i, j, k = 1;
            for (i = 1; i <= 5; i++) 
            {
                for (j = 1; j < i+1; j++) 
                {      //1 2
                    System.out.print(k++ + " ");
                }
       
                System.out.println();
            }
        }
       
    }