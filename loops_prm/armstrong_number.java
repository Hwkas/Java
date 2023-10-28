import java.util.Scanner;

class CheckArmstrong{

	boolean check(String s){

		String n = s;
		int l = n.length();
		char [] c = n.toCharArray();
		int sum = 0;
		for(int i = 0; i < l; i++) sum += Math.pow(Character.getNumericValue(c[i]),l);
		if(n.equals(Integer.toString(sum))) return true;
		else return false;

	}

}

class IsArmstrong{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number to check if it is Armstrong numbers or not: ");
		String x = s.next();

		CheckArmstrong obj = new CheckArmstrong();
		if (obj.check(x)) System.out.println(x+" is an Armstrong number.");
		else System.out.println(x+" is not an Armstrong number.");	

	}

}

class ArmstrongNumbersUptoN{

	public static void main(String [] args){

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number to print all the  Armstrong number upto: ");
		int x = s.nextInt();

		CheckArmstrong obj = new CheckArmstrong();

		for(int i = 0; i <= x; i++){
		       
			if (obj.check(String.valueOf(i))) System.out.println(i);

		}
	}

}
