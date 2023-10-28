import java.util.Scanner;

class Exponent{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number and its power, separated by space: ");

		int x = s.nextInt();
		int y = s.nextInt();

		System.out.println("Result: "+(long)Math.pow(x, y));

	}	

}
