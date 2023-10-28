import java.util.Scanner;

class MaxBetweenTwoNos{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the two numbers you want to compare(separated by space): ");
		
		int a = s.nextInt();
		int b = s.nextInt();
		int max = 0;

		// Using if else 
		if (a > b)
			max = a;
		else max = b;
		
		System.out.println(max);	
		//

		// using terniary operators
		System.out.println("The max between "+a+" and "+b+" is: "+(a>b?a:b));

	}

}
