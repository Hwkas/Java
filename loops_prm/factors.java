import java.util.Scanner;

class Factors{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number to find it's factors: ");

		int n = s.nextInt();
		int f = 0;

		System.out.print("Factors of "+n+" = ");		
		for(int i = n/2; i >= 1; i--){
	
			if (n % i == 0){
				       	
				f = n/i;
				n = i;
				System.out.print(f+" * ");

			}		 
	
		}
		System.out.print(1);
	
	}

}
