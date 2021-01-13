import java.util.*;
public class fineamount{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        double fineamount;
        if(N<=5){
            fineamount=N*0.4;
         //   System.out.println("fineamount="+fineamount);
        }else if(N>5 && N<=10){
            fineamount=N*0.65;
            //System.out.print("fineamount="+fineamount);
        }else
        {
            fineamount=N*0.8;
           // System.out.println("fineamount="+fineamount);
        }
            System.out.println(fineamount);
        }
    }