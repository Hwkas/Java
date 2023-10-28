import java.util.Scanner;

class NumberOfNotes{

	public static void main(String [] args){
		
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the amount ₹");

		int x = s.nextInt();

		// using if else

		if (x >= 500)
			System.out.println("Number of ₹500 notes is "+(int)(x/500));
			x -= ((int)(x/500))*500;
		if (x >= 200)
			System.out.println("Number of ₹200 notes is "+(int)(x/200));
			x -= ((int) (x/200))*200;
		if (x >= 100)
			System.out.println("Number of ₹100 notes is "+(int)(x/100));
			x -= ((int) (x/100))*100;
		if (x >= 50)
			System.out.println("Number of ₹50 notes is "+(int)(x/50));
			x -= ((int) (x/50))*50;
		if (x >= 20)
			System.out.println("Number of ₹20 notes is "+(int)(x/20));
			x -= ((int) (x/20))*20;
		if (x >= 10)
			System.out.println("Number of ₹10 notes is "+(int)(x/10));
			x -= ((int) (x/10))*10;
		if (x >= 5)
			System.out.println("Number of ₹5 notes is "+(int)(x/5));
			x -= ((int) (x/5))*5;
		if (x >= 2)
			System.out.println("Number of ₹2 notes is "+(int)(x/2));
			x -= ((int) (x/2))*2;
		if (x >= 1)
			System.out.println("Number of ₹1 notes is "+(int)(x/1));
			// here we don't need to reduce the value of x.

		//

	}

}
