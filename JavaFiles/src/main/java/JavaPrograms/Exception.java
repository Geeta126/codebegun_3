package JavaPrograms;

public class Exception { 
	public static void main(String[] args) {
		
		try {
		System.out.println("6");
		int sum=8/0;
		}
		catch(ArithmeticException e){
			System.out.println("9,6");
		}
		
		finally{
			System.out.println("3,4,5,6");
		}
		
	}

}





