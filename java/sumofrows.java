import java.util.*;
public class sumofrows
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0,i,j;
        int[][] table= new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                table[i][j]=sc.nextInt();
            }
        }
        for(j=0;j<n;j++)
        {
           sum = sum + table[1][j]; 
        }
        System.out.print(sum);
    }
}