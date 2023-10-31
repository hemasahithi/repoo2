package assistedpro31;

public class Finally2 {

	public static void main(String[] args) {
		// with exception
		try{
			int number=5/0;  
			System.out.println(number);  
			  }  
			catch(NullPointerException e)
			  {
				System.out.println(e);
			  }  
			finally
			  {
		System.out.println("finally block is always executed");
			  }  
			System.out.println("then rest of the code...");  


	}

}
