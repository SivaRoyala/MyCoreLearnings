package com.learn.test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import com.mylearn.core.RotateArray;


public class RotateArrayTest {

	@Test
	public void rotateArrayTest(){
		RotateArray rotateArray = new RotateArray();
		int[] intArray1 = {1,2,3,4,5,6,7};
		int steps1 = 3;
		int[] requiredArray1 = {5,6,7,1,2,3,4};
		int[] newArray1 = rotateArray.rotateArray(intArray1, steps1);
		assertTrue(Arrays.equals(requiredArray1, newArray1));
		
		int[] intArray2 = {1,2,3,4,5,6,7};
		int steps2 = 9;
		int[] requiredArray2 = {6,7,1,2,3,4,5};
		int[] newArray2 = rotateArray.rotateArray(intArray2, steps2);
		assertTrue(Arrays.equals(requiredArray2, newArray2));
		
	}
}
