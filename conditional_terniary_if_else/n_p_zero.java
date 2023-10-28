import java.util.Scanner;

class NegativePositiveOrZero{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number to check if it is negative, positive or zero: ");

		int x = s.nextInt();

		// using if else
		
		if (x ==  0)
			System.out.println(x+" is a zero.");
		else if (x > 0)
			System.out.println(x+" is positive number.");
		else System.out.println(x+" is negative number.");

		//

		// using ternary operator

		System.out.println(x+((x == 0)?" is zero.":((x > 0)?" is positive number.":" is negative number.")));

		//
	}

}
