/*
A positive integer is called an Armstrong number of order n if

abcd... = an + bn + cn + dn + ...
In case of an Armstrong number of 3 digits, the sum of cubes of each digits is equal to the number itself. For example:

153 = 1*1*1 + 5*5*5 + 3*3*3  // 153 is an Armstrong number.
*/


public class armstrong {

    public static void main(String[] args) {

        int number = 153, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)//153//0
        {
            remainder = originalNumber % 10;//1%10=1
            result += Math.pow(remainder, 3);//result = result + Math.pow(remainder,3) = 3^3 + 5^3 + 1^3
            originalNumber /= 10;//originalNumber = originalNumber/10; 1/10=0.1=0
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}