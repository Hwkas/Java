import java.util.Scanner;

class Q12_16{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the Number: ");

		String st = s.next();
		char [] ar = st.toCharArray();
		int len = ar.length;

		// Q12. sum of first digit & last digit
		System.out.println("Sum of first & last digit.");
		System.out.println(Character.getNumericValue(ar[0])+Character.getNumericValue(ar[len-1]));

		// Q13. swapping first digit & last digit
		char swap = '\0';
		System.out.println("Swapping fist & last digit");
		swap = ar[0];
		ar[0] = ar[len-1];
		ar[len-1] = swap;
		System.out.println(ar);

		// Q14. sum of digits
		System.out.println("Printing sum of digits");
		int sum = 0;
		for(int i = 0;i < len; i++) sum += Character.getNumericValue(ar[i]);
		System.out.println(sum);	
		
		// Q15. product of digits
		System.out.println("Printing product of digits");
		int product = 1;
		for(int i = 0;i < len; i++) product *= Character.getNumericValue(ar[i]);
		System.out.println(product);	

		// Q16. sum of digits
		System.out.println("Printing number in reverse");
		for(int i = len-1;i >= 0; i--) System.out.print(ar[i]);	
		
	}

}
