package JavaPrograms;
import java.util.Scanner;

public class Swapping1 {


	public static void main(String[] args) {
		int input1,input2,temp;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter input1 and input2 ::");
		input1=sc.nextInt();
		input2=sc.nextInt();
		temp=input1;
		input1=input2;
		input2=temp;
		
		System.out.println(input1 + " "+ input2);
	}
}
