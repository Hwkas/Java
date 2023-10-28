import java.util.Scanner;

class CharOrNot{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter an input to check if it's a character or not: ");
		
		char c = s.next().charAt(0);
			
		System.out.println(c+((c>= 'a' && c <= 'z')||(c>= 'A' && c <= 'Z')?" is a character.":" is not a character."));

	}

}
