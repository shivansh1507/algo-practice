public class convert1 
{
    public static void main(String[] args)
    {
        int i = 9;
        while(i>=0)
        {
            int k = i;
            while (k>=0)
            {
                System.out.print(k + " ");
                k--;
            }
            System.out.println();
            i--;
        }
    }
}