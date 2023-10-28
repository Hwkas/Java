import java.util.Scanner;

class SumOfNNumbers{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the value of N");
		int x = s.nextInt();
		
		// using while loop
		System.out.println("Using while loop");
		System.out.println("Sum of N Natural numbers");
		int i = 0;
		int sum = 0;
		while(i <= x){
		
			sum += i;
			i++;

		}

		System.out.println(sum);
		
		System.out.println("Sum of even  N Natural numbers");
		i = 2;
		sum = 0;
		while(i <= x){
		
			sum += i;
			i += 2;
		}

		System.out.println(sum);

		System.out.println("Sum of odd  N Natural numbers");
		i = 1;
		sum = 0;
		while(i <= x){
		
			sum += i;
			i += 2;
		}

		System.out.println(sum);

		// using for loop
		System.out.println("Using for loop");
		System.out.println("Sun of N natural numbers");
		sum = 0;
		for(i=1; i<=x; i++) sum += i;
		System.out.println(sum);
		
		System.out.println("Sun of even N natural numbers");
		sum = 0;
		for(i=2; i<=x; i += 2) sum += i;
		System.out.println(sum);
	
		
		System.out.println("Sun of N natural numbers");
		sum = 0;
		for(i=1; i<=x; i+=2) sum += i;
		System.out.println(sum);

	}


}
