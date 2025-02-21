package com.example.excercise.arithmetic;

public class FindLCM {

	public static void main(String[] args) {  
		
		int a=5,b=7	;
		
		System.err.println( findLCM(a, b) );
		
	}
	
	private static int findLCM(int a, int b)
	{
		int lar = Math.max(a, b);
		System.err.println("Largest Number is "+lar);
		
		int small = Math.min(a, b);
		
		System.err.println("Smallest Number is "+small);
		
		for(int i = lar ; ; i+= lar) {
			System.err.println("i = "+i+"\n");
			if(i % small == 0)
				return i;
		}
		
	}

}
