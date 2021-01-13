import java.util.*;
public class alphabetr{
    public static void main(String args[]){
        int alphabet=65;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++){
                System.out.print((char)(alphabet+j));
            }
             System.out.println("");
        }
    }
}