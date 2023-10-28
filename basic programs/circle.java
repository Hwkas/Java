import java.util.Scanner;

//program to find the diameter, circumfrence and area of circle.
class DCAOCricle{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the radius of circle to find its diameter, circumfrence and area: ");

		int r = s.nextInt();

		System.out.println("The diameter of the circle is: "+(2*r)+"\nThe circumfrence of the circle is: "+(2*Math.PI*r)+"\nThe area of circle is: "+(Math.PI*r*r));


	}

}
