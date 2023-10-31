package assistedpro31;

public class Finally3 {

	public static void main(String[] args) {
		// exception handled
		try{
			int number=25/0;  
			System.out.println(number);  
			  }  
			catch(ArithmeticException e)
			  {
				System.out.println(e);
				  }  
			finally
			  {
		System.out.println("finally block is always executed");
				  }  
			System.out.println("rest of the code...");  


	}

}
