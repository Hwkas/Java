import java.util.Scanner;

class MaxBetweenThreeNos{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the three numbers you want to compare(separated by space): ");

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		// using if - else 
		if (a > b && a > c)
			System.out.println("Greatest number is: "+a);
		else if(b > a && b > c)
			System.out.println("Greatest number is: "+b);
		else System.out.println("Greatest number is: "+c);
		//

		// using terniary operators		//     if 	      else if      else
		System.out.println("Greatest number is: "+((a>b && a>c)?a:((b>a && b >c)?b:c)));

	

	}

}
