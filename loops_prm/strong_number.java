import java.util.Scanner;

class StrongNumber{

	boolean check(String st){
			
		char []c = st.toCharArray();
		int sum = 0;
		for(int i = 0; i < c.length; i++){
			
			int temp = 1;
			for(int j = 1; j <= Character.getNumericValue(c[i]); j++) temp *= j;
			
			sum += temp;
		}
		if (st.equals(String.valueOf(sum))) return true;
		else return false;

	}	

}


class IsStrongNumber{

	public static void main(String [] args){
		
		System.out.println("Enter the number you want to check if it is a strong number or not: ");	
		Scanner s = new Scanner(System.in);
		String st = s.next();
		StrongNumber obj = new StrongNumber();
		if(obj.check(st)) System.out.println(st+" is a strong number.");
		else System.out.println(st+" is not a strong number.");

	}

}

class StrongNumberUptoN{

	public static void main(String [] args){

		System.out.println("Enter the number to check all the strong number upto N: ");	
		Scanner s = new Scanner(System.in);
		String st = s.next();
		StrongNumber obj = new StrongNumber();
		System.out.println("Strong Numbers:");
		for(int i = 1; i <= Integer.valueOf(st); i++){ 

			if(obj.check(String.valueOf(i))) System.out.println(i);
		
		}
	}

}
