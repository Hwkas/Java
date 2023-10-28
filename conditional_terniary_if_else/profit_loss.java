import java.util.Scanner;

class ProfitLoss{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the Cost Price: ");
		int c = s.nextInt();
		System.out.print("Enter the Selling Price: ");
		int r = s.nextInt();
		
		int p_l = r - c;

		// using if else

		if (p_l == 0)	System.out.println("Break-Even");
		else if (p_l > 0) System.out.println("Profit of ₹"+p_l);
		else System.out.println("Loss of ₹"+Math.abs(p_l));

		//

		// using terniary operator

		System.out.println((p_l == 0)?"Break-Even":((p_l > 0)?("Profit of ₹"+p_l):("Loss of ₹"+Math.abs(p_l))));

		//




	}

}
