import java.util.Scanner;

class UpperOrLowerCase{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the alphabet to check if it is lower case or upper case: ");

		char c = s.next().charAt(0);

		// using if else

		if (c >= 'a' && c <= 'z') System.out.println(c+" is a lower case alphabet.");
		else if (c >= 'A' && c <= 'Z') System.out.println(c+" is a upper case alphabet.");
		else System.out.println(c+" is not a valid input.");

		//

		// using terniary operator

		System.out.println(c+((c >= 'a' && c <= 'z')?" is a lowe case alphabet.":((c >= 'A' && c <= 'Z')?" is a upper case alphabet.":" is not a valid input.")));

		//

	}

}
