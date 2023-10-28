import java.util.Scanner;

class DivisibleBy5and11{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter a number to check if it is divisible by 5 & 11: ");

		int x = s.nextInt();

		// using if else

		if (x % 5 == 0)
			if (x % 11 == 0)
				System.out.println(x+" is divisible by both 5 & 11.");
			else System.out.println(x+" is divisible by 5 but not divisible 11.");
		else System.out.println(x+" is not divisible by 5"+((x % 11 == 0)?" but divisible by 11.":" & 11"));
		
		//

		// using terniary operator

		System.out.println(x+((x % 5 == 0)?((x % 11 == 0)?" is divisible by both 5 & 11.":" is only divisible by 5."):((x % 11 == 0)?" is not divisible by 5 but divisible by 11.":" is not divisible by 5 & 11.")));
		
		//
	}

}
