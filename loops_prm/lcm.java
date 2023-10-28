import java.util.Scanner;

class LCM{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter two numbers(separated by space) to get their lcm: ");
		
		int a = s.nextInt();
		int b = s.nextInt();
		int f = 1;
		
		int m = (a > b)?a:b;
		for(int i = m/2; i >= 1; i--){

			if((a % i == 0) || (b % i == 0)){

				f *= m/i;
			       	System.out.print(m/i+" * ");
				
				m = i;
				a = (a % i == 0)?(a/f):a;	
				b = (b % i == 0)?(b/f):b;	

			}
			
		
		}
		System.out.println(1);
		System.out.println("LCM = "+f);

	}

}
