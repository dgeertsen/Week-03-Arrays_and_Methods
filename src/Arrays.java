
public class Arrays {

	public static void main(String[] args) {
		//Arrays allow us create a group of similar items. 
		//This allows us to reuse code and compact our program
		String[] students = new String[3];
		students[0] = "Tom Sawyer";
		students[1] = "Huckleberry Finn";
		students[2] = "Timmy Turner";
		//Normal for loop
		for(int i=0;i<students.length; i++)
		{
			System.out.println(students[i]);
			
		}
		
		//Enhanced for loop
		System.out.println("Enhanced for loop:");
		for (String student : students)
		{
			System.out.println(student);
		}
	}

}
