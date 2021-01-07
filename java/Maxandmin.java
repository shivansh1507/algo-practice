import java.util.*;
public class Maxandmin{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
int min,max;
int n=sc.nextInt();
int arr[]=new int[n]; 
for(int i=0; i<n; i++){
   //System.out.print("Enter the element "+(i+1)+": ");
   arr[i]=sc.nextInt();
   }
   min=arr[0];
   max=arr[0];
   for(int i=0; i<n; i++){
     if(min>arr[i]){
       min=arr[i];
     }
     
     if(max<arr[i]){
       max=arr[i];  
     }
   }
   System.out.println(min);
   System.out.println(max);
    }
}