class PrintAlphabets{

	public static void main(String [] args){

		char c = 'a';

		// using while loop
		System.out.println("Using while loop");
		
		while(c <= 'z'){
		       
			System.out.println(c);
			c++;

		}

		// usign for loop

		System.out.println("Using for loop");

		for(c = 'a';c <= 'z'; c++) System.out.println(c);
	}

}
