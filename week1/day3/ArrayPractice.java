package week1.day3;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		int[] numList = {2,5,7,7,5,9,2,3};
		Arrays.sort(numList);
		System.out.println("The sorted array is: "+Arrays.toString(numList));
		int length = numList.length;
				
		for (int i = 0; i < length-1; i++) {
			if(numList[i]==numList[i+1]) {
			System.out.println("The duplicate number is: "+numList[i+1]);
		}
	}
	}
}
