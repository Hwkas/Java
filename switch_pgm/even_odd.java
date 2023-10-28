import java.util.Scanner;

class EvenOrOdd{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the number to check if it is even or odd.");

		int x = s.nextInt();

		switch(((x % 2 == 0)?0:1)){

			case 0:
				System.out.println(x+" is an even number.");
				break;
			case 1:
				System.out.println(x+" is an odd number.");
				break;

		}

	}

}
