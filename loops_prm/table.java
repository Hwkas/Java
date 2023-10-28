import java.util.Scanner;

class Tables{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the number whose table you want to print: ");

		int x = s.nextInt();
		int i = 1;
		
		// using while loop
		System.out.println("Using while loop");
		while(i <= 10){

			System.out.println(x+" * "+i+ " = "+(x*i));
			i++;

		}

		// using for loop
		System.out.println("Using for loop");
		for(i=1;i<=10;i++) System.out.println(x+" * "+i+ " = "+(x*i));

	}

}
