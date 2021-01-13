import java.util.*;
public class divisibleby3and7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num,i;
        num=sc.nextInt();
        for(i=1;i<=num;i++){
            if(i%3==0  && i%7==0){
                System.out.print(i+" ");
            }
        }
    }
}