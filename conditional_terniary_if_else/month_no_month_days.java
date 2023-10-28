import java.util.Scanner;
import java.util.Dictionary;
import java.util.Hashtable;

class MonthNoMonthDays{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);
		Dictionary d = new Hashtable();

		System.out.print("Enter the number of month to get the number of days in it: ");

		int x = s.nextInt();
		
		d.put(1, 31);
		d.put(2, 28);
		d.put(3, 31);
		d.put(4, 30);
		d.put(5, 31);
		d.put(6, 30);
		d.put(7, 31);
		d.put(8, 31);
		d.put(9, 30);
		d.put(10, 31);
		d.put(11, 30);
		d.put(12, 31);
		
		System.out.println("Printing dictionary\n"+d);
		System.out.println(x+" Month = "+d.get(x)+" days.");


	}

}
