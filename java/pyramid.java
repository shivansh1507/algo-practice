import java.util.*;
public class pyramid
{
    public static void main(String args[])
    {
        int i=0,j=0;
        int rows=6;
        for(i=0; i<rows; i++)
        {
            for(j=rows-i; j>1;j--)
            {
            System.out.print(" ");
        }
        for(j=0; j<=i; j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}
}