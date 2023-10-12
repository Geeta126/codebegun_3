
public class ExceptionHandling {
	

		public static void main(String[] args) {
			
			try {
			System.out.println(1/0);
			}catch(ArithmeticException e) {
				System.out.println("ArithmeticException ::");
			}finally {
				System.out.println("Finally block ::");
			}
			
			
		}

	}

