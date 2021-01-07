import java.util.*;
public class traces
{
    public static void main(String args[])
    {
        int array[][]=new int[10][10];
        int i, j;
       double sum = 0, square = 0, result = 0;
  	Scanner s = new Scanner(System.in);
  	int row = s.nextInt();
  	int column = s.nextInt();
 	for(i = 0; i < row; i++)
  	{
   	    for(j = 0; j < column; j++) 
     	    {
      	        array[i][j] = s.nextInt();
                System.out.print(" ");
     	    }
        }
  	for(i = 0; i < row; i++)
  	{  
    	    for(j = 0; j < column; j++)
       	    {
                if(i == j)
            	 {
               	     sum = sum + (array[i][j]);
               	 }
            }
        }
        System.out.println(sum);  
   	for(i = 0; i < row; i++)
   	{
    	    for(j = 0; j < column; j++)
       	    {
       	        square = square + (array[i][j])*(array[i][j]);
            }
    	}
        result = Math.sqrt(square);
        System.out.print( String.format("%.2f",result));
    }
}