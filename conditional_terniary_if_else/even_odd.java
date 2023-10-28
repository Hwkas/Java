import java.util.Scanner;

class EvenOdd{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number,to check if it is even or odd: ");

		int a = s.nextInt();
		// using if else
		if (a % 2 == 0)
			System.out.println(a+" is even number.");
		else System.out.println(a+" is odd number.");
		//

		// using terniary operator
		System.out.println(a+(a % 2 == 0?" is even number.":" is odd number."));
	}

}
