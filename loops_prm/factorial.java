import java.util.Scanner;

class Factorial{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number to get it's factorial: ");

		int x = s.nextInt();
		int fact = 1;

		for(int i = 1; i <= x; i++) fact *= i;
	       	System.out.println("Factorial of "+x+" is "+fact);	

	}

}
