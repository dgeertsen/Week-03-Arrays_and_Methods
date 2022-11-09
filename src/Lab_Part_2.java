
public class Lab_Part_2 {
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[] {"Sam","Sally","Thomas", "Robert"};
		
		//Write a method that takes a String name and prints out a greeting,
		//this method returns nothing
		greet("Devon");
		
		//Write the same method but have it return the greeting
		//this requires println to be here when method is called
		System.out.println(greet2 ("Devon"));
		
		//write a method that takes a string and int, then compares the the length vs the int
		System.out.println(isStringLongerThanNumber("Bill",0));
		
		//Search an Array
		System.out.println(searchArray(names,"Sam"));
		
		//write and test a method that takes an array that takes an array of int and returns smallest number in the array
		
		//write and test a method that takes an array that takes an array of double and returns avg
		
		//write and test a method that takes an array of Strings and returns an array of int where each element
		//matches the length of the String
		
		//write and test a method that takes an array of strings and returns true if the sum of letters for all the strings with
		//an even amount of letters is greater than the sum of those with odd amount of letters
		
		
		
	}
	//Greeting Method
	public static void greet (String name){
	System.out.println("Hello!!!! "+ name);
			
	}
	//Return greeting Method
	public static String greet2 (String name){
	return "Hello!! "+name;
	
	}
	//Compare method
	public static boolean isStringLongerThanNumber(String word, int num)
	{
		return word.length()>num;

	}
	//Search Array
	public static boolean searchArray(String[] array, String string)
	{
		for(String str: array)
		{
			if(str.equals(string)) {
				return true;
			}
		}
		return false;
	}
	
		
	
	
	
	
	
	
}
