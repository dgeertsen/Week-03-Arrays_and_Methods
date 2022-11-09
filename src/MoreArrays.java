
public class MoreArrays {


		// TODO Auto-generated method stub
		
		//Initialize array in 1 line.
		String[] products =new String[] {"Carrots","Pinapple","Tomatos"};
	
		//Print using a normal for loop
		for(String product :products) {
			System.out.println("Product: "+product);
		}	
		
		
		//Print starting at iterator = 1
		int[] multiplesOf3 = new int [10];
		for(int i=1; i<=multiplesOf3.length; i++)
		{
			multiplesOf3[i-1]=i*3;
			System.out.println("Number: "+multiplesOf3[i-1]);
		}
		//Print starting at iterator = 0
		int[] multiplesOf5 = new int [10];
		for(int i = 0;i < multiplesOf5.length;i++) {
			multiplesOf5[i]=(i+1)*5;
			System.out.println(multiplesOf5[i]);
		}
				
	}
	
	

}
