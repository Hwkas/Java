import java.util.Scanner;

//writting a program for the addition of two numbers.
class ArithmeticOperations{
	public static void main(String [] args){
	
		// creating a scanner object
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the two numbers on which you want to perform the arithmetic operations:	");
		
		int x = s.nextInt();
		int y = s.nextInt();

		System.out.println("The addition of "+x+" and "+y+" is: "+(x+y));

		System.out.println("The substraction of "+x+" minus "+y+" is: "+(x-y));

		System.out.println("The multiplication of "+x+" and "+y+" is: "+(x*y));

		System.out.println("The division of "+x+" divided by "+y+" is: "+(float)(x/y));

		System.out.println("The remainder of "+x+" divided by "+y+" is: "+(x%y));
	}
}
