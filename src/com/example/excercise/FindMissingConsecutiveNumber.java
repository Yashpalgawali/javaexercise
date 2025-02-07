package com.example.excercise;


public class FindMissingConsecutiveNumber {

	public static void main(String[] args) {

		//  
		
		int[] arr = {1,3,4,5,6,7,8};
		
		System.err.println("Length is "+arr.length);
		
		int len = arr.length+1;
		int sum =0;
		int exptectedSum = (len * (len+1) )/2;
		System.err.println("Expected Sum "+exptectedSum);
		
		for(int i=0;i<arr.length;i++ ) {
			sum+=arr[i];
		}
		System.err.println("Missing nUmber "+ (exptectedSum - sum));
	}

}
