import java.util.Scanner;

class PowerOfNumber{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number & power (separated by space) to find it's value: ");

		int n = s.nextInt();
	       	int p = s.nextInt();
		int ans = 1;

		for(int i = 0; i < p; i++) ans *= n;
	      	System.out.println(ans);	

	}

}
