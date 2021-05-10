public class gate2015
{
    public static void main(String[] args)
    {
        int i, j, k = 0;
        j = 2 * 3 / 4 + 2 / 5 + 6 / 5; // j = 2 *3 / 4 = 6 / 4 + 2/5 + 6/5= 1 +0+1=2
        k -= --j;// k = k - (--j) = k-1=0-1=-1
        for(i=0;i<5;i++)// i = 4,                         i < 5
        {
            switch (i+k) //4 - 1 = 3
            {
                case 1:  
                  break;       //-1,0,1,1,1,2,2,2,3,3
                case 2:
                System.out.println(i+k); //-1 
                break;
                case 3:
                System.out.println(i+k);   //-1     
                break;    
                default:
                System.out.println(i+k);//-1
            }
        }
    }
}


// the number of times print is executed is __________