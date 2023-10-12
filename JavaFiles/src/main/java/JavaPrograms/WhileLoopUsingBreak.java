package JavaPrograms;

public class WhileLoopUsingBreak {

	public static void main(String[] args) {
		
		int i=10;
		while(i<10) {
			if(i==6) {
			i++;
			continue;
		}
		}
		System.out.println(i);
		i++;
		
		
	}
}
