package com.test;

public class OverLoad {
     

    	    // Method with two integer parameters
    	    public static void printValues(int a, int b) {
    	        System.out.println("Values: " + a + " and " + b);
    	    }

    	    // Method with an integer and a double parameter
    	    public static void printValues(int a, double b) {
    	        System.out.println("Values: " + a + " and " + b);
    	    }

    	    public static void main(String[] args) {
    	        int intValue = 5;
    	        double doubleValue = 3.14;

    	        printValues(intValue, intValue);        // Calls the first method
    	        printValues(intValue, doubleValue);     // Calls the second method
    	    }
    	}
		
		
			
		

