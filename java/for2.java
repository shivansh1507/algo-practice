/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 
2 3
4 5 6 
7   8  9 10
11 12 13 14 15 */
class for2 {
    public static void main(String[] args) {
       
       //int rows = 5;
       
       for(int i = 1; i <= 5; ++i)//i=3
       {
           for(int j = 1; j <= i; ++j)//1 to 2
           {
            
            System.out.print(j + " "); 
           
            }
           
           System.out.println("");//1
                                 //1 2
                                 //1 2 3

       }
    }
 }