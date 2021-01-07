import java.util.*;
public class zerononzero{
    public static void main(String args[]){
        int i,j,k,p=0,q=0,r=0;
        int a[]=new int[6];
        Scanner sc=new Scanner(System.in);
        for(i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<a.length;i++){
            for(j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    p=a[i];
                    a[i]=a[j];  
                    a[j]=p;
                }
            }
        }
        for(i=0;i<a.length;i++){
            for(j=1+i;j<a.length;j++){
                if((a[i]%2==1)&&(a[i]<a[j]))
                {
                    q=a[i];
                    a[i]=a[j];
                    a[j]=q;
                    
                }
            }
        }
        for(i=0;i<a.length;i++){
            for(j=i+1;j<a.length;j++){
                if((a[i]%2==0)&&(a[i]>a[j]))
                {
                    r=a[i];
                    a[i]=a[j];
                    a[j]=r;
                    
                }
            }
        }
        for(i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
    }
}
}
