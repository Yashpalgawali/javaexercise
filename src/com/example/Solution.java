package com.example;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
    	 // Create a HashMap to store numbers and their corresponding indices
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement (the number needed to reach the target)
            int complement = target - nums[i];
            
            // If the complement exists in the map, return the indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, store the current number and its index in the map
            map.put(nums[i], i);
        }
        
        // If no solution exists, throw an exception (problem statement guarantees one solution)
        throw new IllegalArgumentException("No solution found");
    }
}
