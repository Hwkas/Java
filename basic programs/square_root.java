import java.util.Scanner;

class SquareRoot{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number you want to calculate the square root of: ");

		int x = s.nextInt();

		System.out.println("The square root of "+x+" is "+Math.sqrt(x));

	}

}
