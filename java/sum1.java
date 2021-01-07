import java.util.*;
public class sum1
{
    public static void main(String[] args)
    {
        int rowsum,colsum,i,j;
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] A= new int[m][n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<m;i++)
        {
            rowsum=0;
            for(j=0;j<n;j++)
            {
                rowsum = rowsum + A[i][j];
            }
            System.out.println("Row "+i+" "+rowsum);
        }
        for(i=0;i<n;i++)
        {
            colsum=0;
            for(j=0;j<m;j++)
            {
               colsum = colsum + A[j][i]; 
            }
            System.out.println("Column "+i+" "+colsum);
        }
    }
}
