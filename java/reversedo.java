import java.util.*;
public class Reverse{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in); // Creates an object of Scanner class.
		int num = sc.nextInt(); // Asks for number to be reversed.
		int digit = 0, rev = 0; // Declared and initialized the variables digit and rev.
		if (num>=0)//521
		{ 
        	do 
			{ // Start of body of do-while loop.
    			digit = num % 10;
				rev = (rev * 10) + digit;
				num = num/10;	
			} // End of body of do-while loop.
			while (num > 0);		
			        System.out.print("Reversed Number is:" + rev); // Primts the reverse of number.
		}// End of body of if statement.
else
System.out.println("Invalid number");
					      } // End of method main.
		} // End of class Reverse.
