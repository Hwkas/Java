import java.util.Scanner;

class PercentageGrade{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the marks of five subjects(separated by spaces): ");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		int e = s.nextInt();

		float p = ((a+b+c+d+e)/5);

		// using if else

		if (p >= 90) System.out.println("Grade A");
		else if (p >= 80) System.out.println("Grade B");
		else if (p >= 70) System.out.println("Grade C");
		else if (p >= 60) System.out.println("Grade D");
		else if (p >= 40) System.out.println("Grade E");
		else System.out.println("Grade F");
		
		//


	}

}
