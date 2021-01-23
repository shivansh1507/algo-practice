import java.util.*;
public class dectooctal{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
     long octalnum, decimalnum = 0;
     int i = 0;
    octalnum = sc.nextLong();
    while (octalnum != 0) 
     {
      decimalnum = (long)(decimalnum + (octalnum % 10) * Math.pow(8, i++));
      octalnum = octalnum / 10;
     }
    System.out.print(decimalnum);
        
    }
}