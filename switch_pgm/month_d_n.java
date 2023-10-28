import java.util.Scanner;

class DaysInMonthByNumber{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the number of month to get days in that month: ");

		int x = s.nextInt();

		switch(x){

			case 1:
				System.out.println("Number of days in January are: 31");
				break;
			case 2:
				System.out.println("Number of days in February are: 28");
				break;
			case 3:
				System.out.println("Number of days in March are: 31");
				break;
			case 4:
				System.out.println("Number of days in April are 30");
				break;
			case 5:
				System.out.println("Number of days in May are 31");
				break;
			case 6:
				System.out.println("Number of days in June are 30");
				break;
			case 7:
				System.out.println("Number of days in July are 31");
				break;
			case 8:
				System.out.println("Number of days in August are 31");
				break;
			case 9:
				System.out.println("Number of days in September are 30");
				break;
			case 10:
				System.out.println("Number of days in October are 31");
				break;
			case 11:
				System.out.println("Number of days in November are 30");
				break;
			case 12:
				System.out.println("Number of days in December are 31");
				break;

		}

	}

}
