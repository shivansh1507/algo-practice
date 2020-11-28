import java.util.*;
public class asterik2{
    public static void main(String args[])
    {
        int i=0,j=0;
        int rows=4;
        for(i=0;i<rows;i++)
        {
             for(j=2*(rows-i);j>=0;j--)
             {
                 System.out.print(" ");
             }   
             for (j=0; j<=i; j++ )   {   
     
                    System.out.print("* ");   
                                                }   
             System.out.println();
        }
    }
}