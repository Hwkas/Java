class LocalVar{

	public static void main(String[] args){

		// initialinzing and assinging value to local variable
		int x = 20;
		System.out.println("x = "+x);
		
		//printing a null string
		String str = null;
		System.out.println(str);
		
		// printing the string	
		str = "Hello!";
		System.out.println(str);			

		// here is an example how the string concatination works
		String str_cat = 10+20+30+" Hello! "+"\nHere the way java works is that is treats the first nos. before any string as nos., i.e it will print the sum of '10+20+30' as the nos.  here,\nbefore the string 'Hello!' after the first string is starts to treat the no. as string and just concatinates them, ex '5+15+25'+5+15+25"+"will be printed as 51525.";		
		System.out.println(str_cat);

		// declaring refrence varible
		LocalVar obj = null;
		System.out.println(obj);

		obj = new LocalVar();
		System.out.println("Here is the value i.e refrence id stored inside the refrence varible "+obj);
	}

}

