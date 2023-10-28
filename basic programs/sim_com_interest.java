import java.util.Scanner;

class SimpleCompoundInterest{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter Principal Amount: ");
		
		double p = s.nextDouble();
		
		System.out.print("Enter Term: ");
		
		double t = s.nextDouble();
		
		System.out.print("Enter Interest Rate: ");
		
		double r = s.nextDouble();

		System.out.println("Simple Interest: "+(p*r*t)/100);
		System.out.println("Compound Interest: "+p*Math.pow((1 + r/100), t));
		
	}

}
