import java.util.Scanner;

class VowelOrConsonent{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the letter to check if it's a vowel or consonent: ");

		char c = s.next().charAt(0);
		c = Character.toLowerCase(c);

		switch (c){

			case 'a':
				System.out.println(c+" is a vowel.");
				break;
			case 'e':
				System.out.println(c+" is a vowel.");
				break;
			case 'i':
				System.out.println(c+" is a vowel.");
				break;
			case 'o':
				System.out.println(c+" is a vowel.");
				break;
			case 'u':
				System.out.println(c+" is a vowel.");
				break;
			default:
				System.out.println(c+" is a consonent.");

		}	

	}

}
