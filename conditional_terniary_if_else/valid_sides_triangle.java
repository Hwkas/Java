import java.util.Scanner;

class ValidSidesTriangle{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("To check if triangle is valid enter the sides of triangle(separated by space): ");

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		// using if else

		if (a+b > c && b+c > a && c+a > b && a != 0 && b != 0 && c != 0)
			System.out.println("The triangle is valid.");
		else System.out.println("The triangle is invalid.");

		//

		// using terniary operator

		System.out.println((a+b > c && b+c > a && c+a > b && a != 0 && b != 0 && c != 0)?"The triangle is valid.":"The triangle is invalid.");

		//


	}

}
