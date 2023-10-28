import java.util.Scanner;

class FrequencyOfDigits{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number to get the frequency of digits: ");
	       	
		String st = s.next();
		char [] c = st.toCharArray();
		for(int i = 0; i < 10; i++){
			
			int count = 0;
			for(int j = 0; j < c.length; j++){

				if (i == Character.getNumericValue(c[j])) count ++;

			}	

			System.out.println("Frequency of "+i+" = "+count);

		}


	}

}
