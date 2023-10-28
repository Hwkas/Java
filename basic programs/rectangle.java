import java.util.Scanner;

//program to find the parameter and area of circle
class PAORectangle{
	
	public static void main(String [] args){

		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the length and breadth of rectangle to find its parameter and area: ");		
		int x = s.nextInt();
		int y = s.nextInt();

		System.out.println("The parameter: of rectangle is: "+(2*(x+y))+"\nThe area of rectangle is: "+(x*y));	
	
	}
}
