import java.util.*;
public class minimumarray{
    public static void main(String args[]){
        int n,min;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    min=a[i];
                    a[i]=a[j];
                    a[j]=min;
                }
            }
        }
        System.out.print(a[1]);
    }
}