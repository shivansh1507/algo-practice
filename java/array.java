import java.util.*;
public class array{
    public static void  main(String args[]){
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n.length;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n.length;i++){
            System.out.print(n[i]);
        }
    }
}