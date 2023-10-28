import java.util.Scanner;
import java.util.Dictionary;
import java.util.Hashtable;

class WeekNoWeekDay{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the week number to get the week day: ");

		int x = s.nextInt();

		Dictionary d = new Hashtable();
		
		d.put(1, "Sunday");
		d.put(2, "Monday");
		d.put(3, "Tuesday");
		d.put(4, "Wednesday");
		d.put(5, "Thursday");
		d.put(6, "Friday");
		d.put(7, "Saturday");

		System.out.println(x+" = "+d.get(x));


	}

}
