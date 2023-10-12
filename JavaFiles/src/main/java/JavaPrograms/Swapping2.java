package JavaPrograms;

import java.util.Scanner;

public class Swapping2 {
	
	public static void main(String[] args) {
		
		int input5,input6;
		
		 Scanner sc=new Scanner(System.in);
		System.out.println("Enter input5::");
		  input5 = sc.nextInt();
		 
		  System.out.println("Enter input6::"); 
		 input6 =  sc.nextInt();
		 
		 input5=input5+input6;
		 input6=input5-input6;
		 input5=input5-input6;
		 System.out.println(input5+" "+input6);
		 
	}	
//	a=a+b  b=a-b a=a-b
			
		
	}