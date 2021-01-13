import java.util.*;
public class reversing{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num,r,sum=0,t;
        num=sc.nextInt();
        for(t=num;num!=0;num=num/10){
            r=num%10;
            sum=sum*10+r;
        }
        System.out.print(sum);
    }
}