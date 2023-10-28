import java.util.Scanner;

class TotalAvg{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the marks of 5 subjects(separated by spaces): ");

		float a = s.nextFloat();
		float b = s.nextFloat();
		float c = s.nextFloat();
		float d = s.nextFloat();
		float e = s.nextFloat();
					
		System.out.print("Total Marks: "+(a+b+c+d+e)+" Average Marks: "+(float)(a+b+c+d+e)/5+" Percentage: "+((a+b+c+d+e)/500)*100);

	}

}
