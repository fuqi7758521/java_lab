package com.javalab;

public class MethodDemo {
	
	public int max(int a, int b){
		int max = 0;
		if(a >= b){
			max = a;
		}else{
			max = b;
		}
		return max;
	}
	
	public static void main(String[] args) {
		
		MethodDemo demo = new MethodDemo();
		
		System.out.println("The max value is: " + demo.max(3, 4));
		
	}
}
