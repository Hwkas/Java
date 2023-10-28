import java.util.Scanner;

class PerfectNumber{

	boolean check(int x){
		
		int n = x;
		int f = 0;
		int sum = 0;
		for(int i = 1; i <= n/2; i++){
	
			if (n % i == 0){
				       	
				sum += i;

			}		 
	
		}
		if (sum == n) return true;
		else return false;

	}

}

class IsPerfect{

	public static void main(String [] args){

	
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number to check if it is a prefect number or not: ");

		int n = s.nextInt();
		
		PerfectNumber obj = new PerfectNumber();
		if (obj.check(n)) System.out.println(n+" is an Armstrong Number.");
		else System.out.println(n+" is not an Armstrong Number.");
	}

}

class PerfectNumbersUptoN{

	public static void main(String [] args){

	
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number to print all the  prefect numbers upto: ");

		int n = s.nextInt();
		
		PerfectNumber obj = new PerfectNumber();
		System.out.println("All the perfect Numbers are: ");
		for(int i = 1; i <= n ; i++){

			if (obj.check(i)) System.out.println(i);

		}

	}

}
