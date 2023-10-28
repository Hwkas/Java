import java.util.Scanner;

class PrintNaturalNumbers{
	
	public static void main(String [] args){
		
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number upto which you want to print natural numbers: ");

		int x = s.nextInt();
		int i = 1;
		

		System.out.println("Using while loop");
		while(i <= x){

			System.out.println(i);
			i++;
		}
		System.out.println("Using while loop");
		for(int n = 1; n <= x; n++) System.out.println(n); 
		
		System.out.println("Printing N natural numbers in reverse.");
		System.out.println("Using while loop");
		i = x;
		while(i >= 1){

			System.out.println(i);
			i--;
		}
		System.out.println("Using while loop");
		for(i = x; i >= 1; i--) System.out.println(i); 

	}

}
