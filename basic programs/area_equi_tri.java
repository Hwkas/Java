import java.util.Scanner;

class AreaEquiTri{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the measurement of side of triangle: ");

		int x = s.nextInt();

		System.out.println("Area of triangle is: "+(Math.sqrt(3)/4)*(Math.pow(x, 2)));

	}

}
