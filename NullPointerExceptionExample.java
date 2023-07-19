package exceptions;

public class NullPointerExceptionExample {
	
	

	public static void main(String[] args) {
		
		
		try {
		String s=null;
		System.out.println("Length of the string: "s.length());
		}
		
		catch(Exception e) {
			System.out.println("Type of exception is: "+e);
		}
		
		
	}

}



