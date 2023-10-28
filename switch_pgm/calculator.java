import java.util.Scanner;

class Calculator{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.println("Enter two numbers(separated by space): ");
		
		int a = s.nextInt();
		int b = s.nextInt();

		System.out.println("Enter \na: addition\ns: substraction\nm: multiplication\nd: division\nr:remainder");
		
		char c = s.next().charAt(0);

		switch(c){

			case 'a':
				System.out.println("Sum of "+a+" + "+b+" is "+(a+b));
				break;
			case 's':
				System.out.println("Substraction of "+a+" - "+b+" is "+(a-b));
				break;
			case 'm':
				System.out.println("Multiplication of "+a+" * "+b+" is "+(a*b));
				break;
			case 'd':
				System.out.println("Division of "+a+" / "+b+" is "+((float)a/(float)b));
				break;
			case 'r':
				System.out.println("Remainder of "+a+" / "+b+" is "+(a%b));
				break;

		}

	}

}
