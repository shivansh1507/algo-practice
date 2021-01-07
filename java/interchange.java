import java.util.*;
public class interchange{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int q=sc.nextInt();
        int temp=0;
        if(p==q){
            int a[][]=new int[p][q];
            for(int i=0;i<p;i++){
                for(int j=0;j<q;j++){
                    a[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<p;i++){
                for(int j=0;j<q;j++){
                    System.out.print(a[i][j]+"");
                }
                System.out.println();
            }
            for(int j=0;j<q;j++){
                temp=a[i][j];
                 a[j][j] = a[j][q-1-j];
                a[j][q-1-j] = temp;
            }
            for (int i = 0; i < p; i++) 
            {
                for (int j = 0; j < q; j++) 
                {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println("");
            }
        } 
        else 
        {
            System.out.println("Rows not equal to column");
        }
        }
    }
