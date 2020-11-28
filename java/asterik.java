import java.util.*;
public class asterik
{
    public static void main(String args[])
    {
        int i ,j ;
        int rows=4;
        for(i=0;i<rows;i++){
            for(j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}