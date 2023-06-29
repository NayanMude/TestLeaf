package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		
		List<Integer> list1 = new ArrayList<Integer>();
		for(int i=0; i<data.length; i++) {
			list1.add(data[i]);
		}
		System.out.println("The actual list is: "+list1);
		
		Collections.sort(list1);
		System.out.println("The sorted list is: "+list1);
		
		System.out.println("The Second largest number in the list is: "+list1.get(list1.size()-2));
		
	}

}
