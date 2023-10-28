import java.util.Scanner;

class HCF{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter two numbers(separated by space) to get their HCF: ");

		int a = s.nextInt();
		int b = s.nextInt();
		int f = 1;
		
		// smaller b/w the two		
		int n = (a < b)?a:b;
		// greater b/w the two 
		int m = (a > b)?a:b;
		System.out.print("Factors of "+a+" & "+b+" = ");
		// if the numbers are factors of each other or say the greater number is completely divisible by the smaller one, then the number can have a hcf greater then 1.
        	if(m % n == 0){
			// using for loop, n/2 as a number is only divisible by a number which is it half or even less.
    			for(int i = n/2;i >= 1; i--){
				// if both a & b are compeltelu divisible by i.
    				if (a % i == 0 && b % i == 0){
    					// f = quotient here or say factor
    					f *= n/i;
    					System.out.print((n/i)+" * ");
    					n = i;
					// updating the value of a & b.
    					a = a/f;
    					b = b/f;
    			
    				
    				}
    			
    
    			}
        	}
		System.out.println(1);
		System.out.println("HCF = "+f);

	}

}
