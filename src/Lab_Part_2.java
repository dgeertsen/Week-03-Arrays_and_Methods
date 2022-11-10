import java.awt.geom.Arc2D.Double;

public class Lab_Part_2 {
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[] {"Sam","Sally","Thomas", "Robert","bill"};
		int[] array = new int[] {5,2,8,13,-100,6,1,-88};
		double[] array2 = {45.7,30.20,67.3};
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
		System.out.println(smallestInt(array));
		//write and test a method that takes an array that takes an array of double and returns avg
		System.out.println(averageArray(array2));
		//write and test a method that takes an array of Strings and returns an array of int where each element
		//matches the length of the String
		int[] results = stringLength(names);
		//Iterate and print the new array.
		for (int number:results) {
			System.out.println(number);
		}
		
		//write and test a method that takes an array of strings and returns true if the sum of letters for all the strings with
		//an even amount of letters is greater than the sum of those with odd amount of letters
		System.out.println(letterSum(names));
		//write a method that tests if a string is a palindrome
		
	}
	//Greeting Method
	public static void greet (String name){
		//Print, concatenate and return passed in string.
		System.out.println("Hello!!!! "+ name);
			
	}
	//Return greeting Method
	public static String greet2 (String name){
		//Concatenate and return passed in string.
		return "Hello!! "+name;
	
	}
	//Compare method
	public static boolean isStringLongerThanNumber(String word, int num)
	{
		//Compare length of passed in string to passed in int
		return word.length()>num;

	}
	//Search Array
	public static boolean searchArray(String[] array, String string)
	{
		//Iterate passed in array
		for(String str: array)
		{
			//Compare current index to passed in String
			if(str.equals(string)) {
				return true;
			}
		}
		return false;
	}
	
	//Smallest int of an array
	public static int smallestInt(int[] numbers)
	{
		//Initialize smallest int as index 0
		int smallInt =numbers[0];
		//Iterate passed in array
		for (int number:numbers) {
			//Compare current smallest to current number
			if( smallInt > number) {
				smallInt = number;
			}
		}
			
		return smallInt;
		
	}
	
	//returns avg of array2
	public static double averageArray(double[] array){
		double total=0;
		
		//Iterate passed in array
		for(double num:array)
		{
			total += num;
		}
		//return and calculate average
		return total / array.length;
		
	}
	
	//String length to int[]
	public static int[] stringLength(String[] array) {
		int[] lengthArray = new int[array.length];
		
		//Iterate over the passed in array
		for(int i =0;i<array.length;i++) {
			//Assign values to int array based on string lengths 
			lengthArray[i]=array[i].length();
			
		}
		
		//Returns the Array but not its values.
		//Notice we create a new array in main method.
		return lengthArray;
	}
	
	//Compare odd / even count strings of an array
	public static boolean letterSum(String[] array) {
		int odd=0, even=0;
		//Iterate over passed in array
		for(String letters: array)
		{
			//Check for odd / even values & keep count
			if(letters.length()%2==0)
			{
				even++;
			}
			else {
				odd++;
			}
		}
		//Compare counts
		if (even>odd) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean isPalindrome(String myString) {
		for(int i =0; i<myString.length();i++){
			
			if(myString.charAt(i)!=myString.charAt(myString.length()-i-1)) {
				return false;
			}
		}
	}
	
}
