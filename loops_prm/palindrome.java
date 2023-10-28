import java.util.Scanner;
import java.util.Arrays;

class PalindromeNumber{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the number to check if is palindrome or not: ");
		String st = s.next();
		char []c = st.toCharArray();
		char []p = new char[c.length];
		int l = c.length;
		for(int i = 0; i < l; i++) p[i] = c[l-i-1];
		System.out.println(p);
		
		if (Arrays.equals(c, p)) {
		
			System.out.println("The no. is a palindrome number.");
		
		}
		else {
			
			System.out.println("The no. is not palindrome number.");

		}

	}
	
}
