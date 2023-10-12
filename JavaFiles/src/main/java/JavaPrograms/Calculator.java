package JavaPrograms;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] arg) {
		
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter FirstNumber : ");
	int input1=sc.nextInt();
	System.out.print("Enter SecondNumber : ");
	int input2=sc.nextInt();
	
	System.out.print("Enter the operators(+,-,*,%,/) : ");
	String operation=sc.next();
	 
	switch (operation){
	case "+":
		int result = input1+input2;
		System.out.print(result);
		break;
	case "-":
		int result1 = input1-input2;
		System.out.println(result1);
		break;
	case "*":
		int result2 = input1*input2;
		System.out.println(result2);
		break;
	case "%":
		int result3 = input1%input2;
		System.out.println(result3);
		break;
	case "/":
		int result4 = input1/input2;
		System.out.println(result4);
		break;	 		 
	}
	}
}
