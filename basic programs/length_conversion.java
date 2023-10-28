import java.util.Scanner;

class LengthConversion{

	public static void main(String [] args){
	
		Scanner s = new Scanner(System.in);
	
		System.out.print("Enter the measurement in centimeter: ");

		int x = s.nextInt();
	
		System.out.println("After conversion "+(x/100)+" m or "+(x/100000)+" km.");

	}

}
