import java.util.*;
public class oddevensum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
            int i=0,odd_sum=0,even_sum=0,n;
            n=sc.nextInt();
            while(i!=n){
                if(i%2==1)
                odd_sum=odd_sum + i;
                else
                even_sum=even_sum+i;
                i++;
                
            }
            System.out.println(odd_sum +" "+even_sum);
    }
}