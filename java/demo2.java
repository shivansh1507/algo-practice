public class demo2
{
    public static void main(String[] args)
    {
        boolean t = true;
        first:{
            second:{
                third:{
                    System.out.println("before the break");
                    if(t) break second;
                    System.out.println("This won't execute");
                }
                System.out.println("This won't execute");
            }
            System.out.println("After second block");
        }
    }
}