import java.util.*;
public class interchange2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int temp=0;
      int [][]a=new int [n][n];
      for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              a[i][j]=sc.nextInt();
              
          }
      }
      for(int i=0;i<n;i++){
          if(i!=n/2){
              temp=a[i][i];
              a[i][i]=a[i][n-i-1];
              a[i][n-i-1]=temp;
          }
      }
      for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              System.out.print(a[i][j]);
          }
           System.out.println();
      }
              
          }
      }