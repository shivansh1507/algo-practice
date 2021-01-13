import java.util.*;
public class trianglebreakandcontinue{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,j,rows,count=1;
        rows=sc.nextInt();
        for(i=1;i<=rows;i++){
            for(j=1;j<=rows;j++){
                System.out.print(count);
                count++;
                if(i==j)
                break;
                else
                continue;
            }
            System.out.println("");
                }
            }
        }