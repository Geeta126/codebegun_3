package Test;

import java.util.Scanner;

public class FibonacciSeries {
	int input;
	static int num1=0;
    static int num2=1;
    static int num3;	

	public static void main(String[] args) {
		
      Scanner sc=new Scanner(System.in);
       System.out.print("Enter the number ::");
      int input=sc.nextInt(); 
      
      System.out.print(num1+" "+num2+" ");
      
      for(int i=1;i<=input;i++) {
    	  num3=num1+num2;
          num1=num2;
    	  num2=num3;
    	  System.out.print(num3+ " ");
    	 }
      
      
    		   
      }

}
