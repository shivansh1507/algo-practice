import java.util.*;
public class searchkey
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int key = sc.nextInt();
        int[][] A= new int[m][n];
        boolean flag = false;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(A[i][j]==key)
                {
                    flag = true;
                    System.out.println(i+","+j);
                }
            }
        }
        if(flag==false)
                {
                    System.out.println("Not found");
                }
    }
}



 