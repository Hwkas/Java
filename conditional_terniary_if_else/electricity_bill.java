import java.util.Scanner;

class ElectricityBill{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the unit consumed: ");

		int x = s.nextInt();
		double b = 0;

		b = (50 * 0.5);
		x -= 50;
		
		// using if else
		
		if (x > 0)
		{
			b += (100 * 0.75);
			x -= 100;
		
		}

		if (x > 0)
		{

			b += (100 * 1.2);
			x -= 100;

		}

		if (x > 0)
		{
		
			b += (x * 1.5);
		
		}
		
		// 

		System.out.println("Total Bill ₹"+(b+(b*0.2)));

	}

}
