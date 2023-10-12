package fractions;
public class Fractions {
public static void main(String[] arg) {
	
	System.out.print("1 ");
	int range=10;double result=1;

	int tmp=1;
	
	for(int i=1;i<=range;i+=2) {
		
		if(tmp%2!=0) {
			System.out.print(" + ");
			result +=1.0/i;
		}else {
			System.out.print(" - ");
			result -=1.0/i;
		}
		System.out.print(" 1/"+i);
		tmp +=1;
	}
	System.out.println( " = "+result);
	
	}
	} 