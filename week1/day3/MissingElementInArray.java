package week1.day3;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6,7,8};
		
		System.out.println("The given array is: "+Arrays.toString(arr));
		int length = arr.length;
		Arrays.sort(arr);
		
		for(int i =0; i<length; i++) {
			if(i+1!=arr[i]) {
				System.out.println("The Missing number is: "+(i+1));
				break;
			}
		}
		
	}

}
