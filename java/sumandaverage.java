import java.util.Scanner;
public class sumandaverage
{
    public static void main(String[] args) 
    {
        int n=10, sum = 0;
        double  average;
        Scanner sc = new Scanner(System.in);
        //n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n ; i++)
        {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println(sum);
        average = (double)sum / n;
        System.out.println(average);
    }
}