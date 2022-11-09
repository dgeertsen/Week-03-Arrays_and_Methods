
public class Methods {
	
	
	public static void main(String[] args) {
		//Method is a way to modularize code
		//Great for code reuse
		
		String[] firstName = new String[] {"Bob","Fred","Stan","Bill"};
		String[] lastName = new String[] {"Ross","Rogers. ","Lee","Nie"};
		for(int i=0;i<firstName.length;i++) {
			String fullName = createFullName(firstName[i], lastName[i]);
			System.out.println(fullName);
			
		}
		
		
		
		
	}
	
	//Method Signature
	//Public Static: Access modifier
	//String: Return type
	//createFullName: Method Name. Allows you to call it
	//In Parentheses: Input, that the method needs to run 
	public static String createFullName(String x, String y){
		return x+" "+y;		 
	}
	
	
}
