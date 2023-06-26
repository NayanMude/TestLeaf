package week1.day3;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data= {3,2,11,4,6,7};
		System.out.println("The input array is: "+Arrays.toString(data));
		Arrays.sort(data);
		int length = data.length;
		System.out.println("The second largest number in the array is: "+data[length-2]);

	}

}
