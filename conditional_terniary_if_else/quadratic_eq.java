import java.util.Scanner;

class QuadraticEquationsRoots{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.println("For quadratic equation (ax^2 + bx + c = 0), enter a, b & c.");
		
		System.out.print("a = ");
		int a = s.nextInt();
		System.out.print("b = ");
		int b = s.nextInt();
		System.out.print("c = ");
		int c = s.nextInt();
		
		double dis = 0; // discriminant  b^2 - 4ac
		dis = Math.sqrt((Math.pow(b, 2) - 4*a*c));
		
		// uing if else

		if (dis == 0)
			System.out.println(-b/(2*a));
		else{
		
			System.out.println((-b+dis)/(2*a));
			System.out.println((-b-dis)/(2*a));

		}

		//

		// using terniary opertor

		System.out.println((dis == 0)?("Root "+(-b/(2*a))):(("Root "+((-b+dis)/(2*a))+"\n"+("Root "+((-b-dis)/(2*a))))));
		
		//
	}

}
