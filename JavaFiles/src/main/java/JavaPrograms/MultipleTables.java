package JavaPrograms;

import java.util.Scanner;

public class MultipleTables {

	public static void main(String[] args) {
		int i;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter number :: ");
	  int num=sc.nextInt();
	  
	  for( i=1;i<=10;i++) { 
		  System.out.println(num + "*" + i + "=" + num*i);
		  
	  }
	 }

}
