import java.util.*;
public class alphabetpyramid{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        for(int i= rows;i>=0;i--){
            int alphabet=65;
            for(int j=0;j<=i;j++){
                System.out.print((char)(alphabet+j)+"");
            }
            System.out.println();
        }
        for(int i=0;i<=rows;i++){
            int alphabet=65;
            for(int j=0;j<=i;j++){
                System.out.print((char)(alphabet+j)+"");
            }
            System.out.println();
        }
    }
}