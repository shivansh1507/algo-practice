/*
*               j=1
* *             j=1 * , j=2 *
* * *           j=1 * j=2 * j=3 *
* * * *
* * * * * //rows?
*/
// alignment - left
//loops- for-nested for
//how many loops ?
public class prog1 
{

    public static void main(String[] args) 
    {
        int rows = 5;

        for(int i = 1; i <= rows; i++) {// upper limits
            for(int j = 1; j <= i; j++) {// i= 4, j = 1, * , j= 2, * , j= 3,*, j=4,*
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}