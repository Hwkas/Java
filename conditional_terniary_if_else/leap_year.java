import java.util.Scanner;

class LeapYear{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the year to check if it's a leap year or not: ");

		int a = s.nextInt();

		// using if else
		if ((a % 4 == 0) && ((a % 400 == 0) || (a % 100 != 0)))
			System.out.println(a+" is a leap year.");
		else System.out.println(a+" is not a leap year.");

		System.out.println(a+((a % 4 == 0 && a % 100 != 0?" is leap year":(a % 400 == 0?" is leap year":" is not a leap year."))));

	}

}
