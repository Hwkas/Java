import java.util.Scanner;

class GrossSalary{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter Basic Salary: ₹");

		int x = s.nextInt();

		// using if else

		if (x <= 10000) System.out.println("Gross Salary ₹"+(x+(x*0.2)+(x*0.8)));
		else if (x <= 20000) System.out.println("Gross Salary ₹"+(x+(x*0.25)+(x*0.9)));
		else System.out.println("Gross Salary ₹"+(x+(x*0.3)+(x*0.95)));

		//

		// using terniary operator
		
		System.out.println((x <= 10000)?(("Gross Salary ₹"+(x+(x*0.2)+(x*0.8)))):((x <= 20000)?("Gross Salary ₹"+(x+(x*0.25)+(x*0.9))):("Gross Salary ₹"+(x+(x*0.3)+(x*0.95)))));

		//
	}

}
