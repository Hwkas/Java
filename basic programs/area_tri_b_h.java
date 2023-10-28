import java.util.Scanner;

class AreaNonEquiTriangle{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the base & height(separated by space) of triangle to find its area: ");
		
		int b = s.nextInt();
		int h = s.nextInt();

		System.out.println("Area of triangle is: "+(float)(b*h)/2);	

	}

}
