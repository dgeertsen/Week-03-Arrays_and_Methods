
public class Lab_Part_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an array with the following values 1,5,2,8,13,6
		int[] array = new int[] {1,5,2,8,13,6};
		//print out first element of myIntArray
		System.out.println(array[0]);
		
		//print out last element of myIntArray
		System.out.println(array[array.length-1]);
		
		//print out index 6. Gives out of bounds exception
		//System.out.println(myIntArray[6]);
		//print out index -1. Gives out of bounds exception
		//System.out.println(myIntArray[-1]);
		
		//write a traditional for loop that prints array
		//Ask tutor why mine needs length - 1
		for(int i = 0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		//write an enhanced  for loop that prints array
		for(int number :array) {
			System.out.println(number);
		}
		
		//Add all numbers in the array
		int sum = 0;
		for(int number :array) {
			sum+=number;
		}
		System.out.println(sum);
		
		//avg of the array
		int average = sum / array.length;
		System.out.println(average);
		
		//enhanced for loop to print odd numbers only
		for(int number :array) {
			if(number %2 !=0) {
				System.out.println(number);
			}
		}
		
		//write an array that contains "Sam","Sally","Thomas" & "Robert"
		String[] names = new String[] {"Sam","Sally","Thomas", "Robert"};
		
		//calculate the sum of all the letters
		int letterSum =0;
		for(String name :names) {
			letterSum+=name.length();
		}
		System.out.println(letterSum);
	}
}
