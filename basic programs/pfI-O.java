import java.util.Scanner;

class InputOutput{
	public static void main(String [] args){
		
		// creating a Scanner object 's'.
		Scanner s = new Scanner(System.in);
		// scanning & printing a Character Data-Type.
		System.out.print("Enter your desired character:   ");
		char c = s.next().charAt(0);
		System.out.println("The character entered by you is:  "+c);
		
		// scanning & printing a String(single word) Data-Type.
		System.out.print("\nEnter your desired word:   ");
		String w = s.next();
		System.out.println("The word entered by you is:  "+w);
		
		// cosuming the left over line using nextLine method.
		s.nextLine();	
		// scanning & printing a String(whole line) Data-Type.
		System.out.print("\nEnter your desired line of stings(whole line of words):   ");
		String l = s.nextLine();
		System.out.println("The line of strings(whole line of words) entered by you is:  "+l);
	
		// scanning & printing a Boolean Data-Type.
		System.out.print("\nEnter your desired boolean(true/false):   ");
		boolean b = s.nextBoolean();
		System.out.println("The boolean entered by you is:  "+b);
	
		// scanning & printing a Byte Data-Type.
		System.out.print("\nEnter your desired byte(number):   ");
		byte by = s.nextByte();
		System.out.println("The byte(number) entered by you is:  "+by);
	
		// scanning & printing a Short Data-Type.
		System.out.print("\nEnter your desired short(number):   ");
		short sh = s.nextShort();
		System.out.println("The short an entered by you is:  "+sh);
	
		// scanning & printing a Integer Data-Type.
		System.out.print("\nEnter your desired integer:   ");
		int i = s.nextInt();
		System.out.println("The integer entered by you is:  "+i);
	
		// scanning & printing a Long Data-Type.
		System.out.print("\nEnter your desired long(number):   ");
		long lo = s.nextLong();
		System.out.println("The long entered by you is:  "+lo);
	
		// scanning & printing a Float Data-Type.
		System.out.print("\nEnter your desired float(decimal number):   ");
		float f = s.nextFloat();
		System.out.println("The float entered by you is:  "+f);
	
		// scanning & printing a Double Data-Type.
		System.out.print("\nEnter your desired double(number):   ");
		double d = s.nextDouble();
		System.out.println("The double entered by you is:  "+d);

	}
}
