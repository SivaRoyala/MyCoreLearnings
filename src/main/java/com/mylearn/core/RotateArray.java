package com.mylearn.core;

/**
 * Rotate an array of n elements to the right by k steps.
 * 
 * For example, with n=7, and k=3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]
 * For example with n=7, and k=9, the array [1,2,3,4,5,6,7] is rotated to [6,7,1,2,3,4,5,6]
 * 
 * @author SivaRoyala
 *
 */
public class RotateArray {


	/**
	 * This method contains basic logic using normal loops
	 *  
	 * @param nums
	 * @param steps
	 * @return
	 */
	public int[] rotateArray(int[] nums, int steps){
		if (steps > nums.length) {
			steps = steps % nums.length;
		}
		int[] resultArray = new int[nums.length];
		for (int i = 0; i < steps; i++) {
			resultArray[i] = nums[nums.length - steps + i];
		}
		int count = 0;
		for (int i = steps; i < nums.length; i++) {
			resultArray[i] = nums[count];
			count++;
		}
		return resultArray;
	}
	
	public int[] rotateArrayUsingBubbleSort(int[] nums, int steps){
		if(nums == null || steps > nums.length){
			
		}
		return null;
	}
}
