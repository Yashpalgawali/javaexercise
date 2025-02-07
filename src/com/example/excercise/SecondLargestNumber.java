package com.example.excercise;

public class SecondLargestNumber {

	public static void main(String[] args) {
		 int[] arr1 = {10, 5, 10};
	        int[] arr2 = {1, 2, 4, 41, 54, 65};
	        int[] arr3 = {10, 5, 10, 10};
	        
	        System.out.println(findSecondLargest(arr1)); // Output: 5
	        System.out.println(findSecondLargest(arr2)); // Output: 54
	        System.out.println(findSecondLargest(arr3)); // Output: -1
	}
	 public static int findSecondLargest(int[] arr) {
	        // Initialize the largest and second largest values to -1
	        int largest = -1, secondLargest = -1;
	        
	        // Iterate through the array
	        for (int num : arr) {
	            if (num > largest) {
	                // Update secondLargest and largest
	                secondLargest = largest;
	                largest = num;
	            } else if (num > secondLargest && num != largest) {
	                // Update secondLargest if the number is smaller than largest but greater than secondLargest
	                secondLargest = num;
	            }
	        }
	        
	        // If secondLargest is not updated, return -1 (means no distinct second largest element)
	        return secondLargest;
	    }
}
