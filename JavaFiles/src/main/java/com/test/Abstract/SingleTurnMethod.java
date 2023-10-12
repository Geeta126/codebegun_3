package com.test.Abstract;

public class SingleTurnMethod {
    int input1=10;
    int input2=30;
    int input3=20;
    int input4=50;
    
    private SingleTurnMethod(){
    	
    }
    
    public static SingleTurnMethod st;
    
    public static SingleTurnMethod getObject() {
    	if (st==null) {
    		return st = new SingleTurnMethod();
    	}
    	return st;
    	
    }

}
