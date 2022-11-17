
public class Lecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] x = new int[100];
		int evens= 0, odds = 0;
		for(int j = 0; j < x.length; j++) {
			x[j] =(int)(Math.random() * 1000 + 1);
			if(x[j] % 2 == 0 )
				evens++;
			else
				odds++;
			
			
			
			System.out.print( x[j] + " ");
		}
		//2 lines here, tell me how many are even, and how many are odd!
			
		System.out.println("\nEven Numbers: " + evens);
		
		System.out.println("Odd Numbers: " + odds);
		
		
		
		
	}

}
