import java.util.*;
public class Sum{
    public static void main(String args[]){
        Scanner sc=new Scanner(Ssystem.in);
        int sumr=0;
        int sumc=0;
        int r=sc.nextInt();
        int c= sc.nextInt();
        int[][]a=new int[r][n];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
            for(int i=0;i<r;i++){
                sumr=0;
                            for(int j = 0; j < c; j++){  
              sumr = sumr+ a[i][j];  
            }  
            System.out.println("Sum of " + (i+1) +" r: " + sumr);  
        }  

            }

              for(int i = 0; i < c; i++){  
            sumc = 0;  
            for(int j = 0; j < r; j++){  
              sumc = sumc + a[j][i];  
            }  
            System.out.println("Sum of " + (i+1) +" c: " + sumc);  
        }  
        }
    }
