package JavaPrograms;

import java.util.Scanner;

public class EvenOdd {
	static int n;
	 static int choice=1;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		
		while(choice==1) {
			System.out.print("Enter a number ::");
			int n=sc.nextInt();
			if(n%2==0) {
				System.out.println("given number is even ");
				}
			else {
				System.out.println("given number is odd");
			}
		System.out.println("Enter the choice to continue ::");
		choice=sc.nextInt();
		}
		System.out.println("Exit the program");
		
	}
}
		
	
	


