import java.util.Scanner;

class VowelOrNot{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the character you want to check if it i vowel or not: ");

		char c = s.next().charAt(0);

		// using if else

		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			System.out.println(c+" is a vowel.");
		else System.out.println(c+" is not a vowel.");

		//

		// using terniary operator

		System.out.println(c+((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')?" is a vowel.":" is not a vowel."));
		
		//

	}

}
