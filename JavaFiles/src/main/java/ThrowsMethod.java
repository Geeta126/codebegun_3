
public class ThrowsMethod {
	
		static int a;
		static void checkAge(int a) {
			
			if(a<25) {
				throw new ArithmeticException("Access Not Denied");
				
			}else {
				System.out.println("Access Denied");
			}
			
		}
	public static void main(String[]args) {
		checkAge(13);
	}

	}
