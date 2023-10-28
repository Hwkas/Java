import java.util.Scanner;

class DayConversion{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number of Days for conversion: ");

		int x = s.nextInt();

		System.out.println("After conversion: "+(x/365)+" years "+(x%365)/7+" weeks "+(x%365)%7+" days.");

	}

}
