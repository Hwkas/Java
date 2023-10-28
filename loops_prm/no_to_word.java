import java.util.Scanner;

class NumberToWord{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number to print it in words: ");

		String st = s.next();
		char [] c = st.toCharArray();

		for(int i = 0; i < c.length; i++){

			switch(c[i]){

				case '0':
					System.out.print("Zero ");
					break;
				case '1':
					System.out.print("One ");
					break;
				case '2':
					System.out.print("Two ");
					break;
				case '3':
					System.out.print("Three ");
					break;
				case '4':
					System.out.print("Four ");
					break;
				case '5':
					System.out.print("Five ");
					break;
				case '6':
					System.out.print("Six ");
					break;
				case '7':
					System.out.print("Seven ");
					break;
				case '8':
					System.out.print("Eight ");
					break;
				case '9':
					System.out.print("Nine ");
					break;

			}

		}

	
	}

}
