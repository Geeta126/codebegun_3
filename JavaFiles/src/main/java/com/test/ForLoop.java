package com.test;

public class ForLoop {
	
   public static void main(String[] args) {
	  int n= 10,i,j,count;
	    for ( i=2;i<=n;i++) {
	    	count=0;
			for(j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
	        }
			if (count==2) {
			System.out.println(i);
			}		
          }    
			    
   }
} 
   
   
   
	   
	 
	    	 
	     
	   
	   
	   

