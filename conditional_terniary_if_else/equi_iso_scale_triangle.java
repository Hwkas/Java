import java.util.Scanner;

class EquiIsoScaTriangle{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("To identify the type of triangle enter it's sides(separated by space): ");

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		// using if else

		if (a == b && b  == c )
			System.out.println("It is an equilateral triangle.");

		else if (a == b || b == c || a == c)
			System.out.println("It is an isosceles triangle.");
	
		else System.out.println("It is a scalene triangle.");

		//

		// using terniary operators

		System.out.println(((a==b && b==c)?"It is an equilateral triangle.":((a==b||b==c||c==a)?"It is an isosceles triangle.":"It is scalene triangle.")));
		//
	}

}

