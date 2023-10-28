import java.util.Scanner;

class TempConversion{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the temperature in Fahrenheit: ");

		float x = s.nextFloat();

		System.out.println("After conversion: "+((x-32)*5/9)+" celsius");

	}

}
