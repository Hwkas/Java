import java.util.Scanner;

class ThirdAngle{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter two angles of triange separated by space: ");

		int x = s.nextInt();
		int y = s.nextInt();

		System.out.println("The third angle of the triangle is: "+(180-x-y));

	}

}
