package com.example.excercise;

import java.util.Arrays;

public class FindLargestItem {

	public static void main(String[] args) {
		// Find largest item
		int arr[] = {1,10,1,1};
		
		System.out.println("Length = "+arr.length);
		
		if(arr.length==1) {
			System.err.println("One element "+arr[0]);
		}
		else {
			Arrays.sort(arr);
			System.err.println("Mulitple items \n");
			
			int dup=0;
			
			for(int i=0;i<arr.length;i++) {
				if(arr[0]== arr[i]) {
					++dup;
				}
			}
			if(dup == arr.length) {
				System.out.println("Same eletments "+arr[0]);
			}
			else {
				System.err.println("Largets in different items list is "+arr[arr.length-1]);
			}
		}
		
// End of finding largest item 		
	}

}
