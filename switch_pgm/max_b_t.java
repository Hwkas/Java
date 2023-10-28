import java.util.Scanner;

class MaxBetweenTwo{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the two numbers(separated by space): ");

		int a = s.nextInt();
		int b = s.nextInt();

		switch((a > b)?0:((a==b)?3:1)){

			case 0:
				System.out.println(a+" is greater then "+b);
				break;
			case 1:
				System.out.println(b+" is greater then "+a);
				break;
			default:
				System.out.println(a+" & "+b+" are equal.");

		}

	}

}
