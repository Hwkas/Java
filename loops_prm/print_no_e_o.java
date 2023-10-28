class PrintEvenOddNumbers{

	public static void main(String [] args){

		int n = 1;

		// usign while loop
		System.out.println("Using while loop");
		System.out.println("Odd numbers.");
		while(n <= 100){

			System.out.println(n);
			n += 2;

		}
		
		System.out.println("Even numbers.");
		n = 2;
		while(n <= 100){

			System.out.println(n);
			n += 2;

		}

		// using for loop
		System.out.println("Using for loop");
		System.out.println("Odd numbers.");
		for(n = 1; n <= 100; n += 2) System.out.println(n); 
		
		System.out.println("Even numbers.");
		for(n = 2; n <= 100; n += 2) System.out.println(n); 

	}

}
