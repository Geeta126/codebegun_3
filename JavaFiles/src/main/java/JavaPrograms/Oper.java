package JavaPrograms;

import java.util.Scanner;

public class Oper {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of a & b");
		int a =sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println(b++ - --b + ++a + b--);
		
	}
}
