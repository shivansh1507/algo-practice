import java.util.*;
public class ac{
    public static void main(String args[]){
        int [] a1={2,2,3};
        int [] a2={4,5,6};
        int length=a1.length+a2.length;
        int [] ac=new int[length];
        int p=0;
         for (int element : a1) {
            ac[p] = element;
            p++;
        }

        for (int element : a2) {
            ac[p] = element;
            p++;
        }

        System.out.println(Arrays.toString(ac));
    }
}