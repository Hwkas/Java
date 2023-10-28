import java.util.Scanner;

class AlphabetDigitSpecialCharacter{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the character to check if it is a Alphabet, Digit or Special Character: ");

		char c = s.next().charAt(0);

		// using if else

		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
		       System.out.println(c+" is a Alphabet.");
		else if (c >= '0' && c <= '9')
		       System.out.println(c+" is a Number Digit.");	
		else System.out.println(c+" is a Special Character.");	

		//

		// using terniary operator

		System.out.println(c+((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')?" is a Alphabet.":((c >= '0' && c <= '9')?" is a Number Digit.":" is a special Character.")));	

		//


	}

}
