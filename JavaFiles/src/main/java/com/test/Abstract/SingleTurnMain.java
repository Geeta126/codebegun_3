package com.test.Abstract;

public class SingleTurnMain {

	public static void main(String[] args) {
		SingleTurnMethod st=SingleTurnMethod.getObject();
        st.input1 = 20;
        st.input2 = 50;
        System.out.println(st.input1);
        
        SingleTurnMethod st1 = st;
        st1.input1 = 30;
        System.out.println(st.input1+st.input2);
	}

}
