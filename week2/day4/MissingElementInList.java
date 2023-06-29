package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInList {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,7,6,8};
		
		List<Integer> list1 = new ArrayList<Integer>();
		for(int i=0; i<arr1.length; i++) {
			list1.add(arr1[i]);
		}
		System.out.println("The actual list is: "+list1);
		Collections.sort(list1);
		System.out.println("The sorted list is: "+list1);
		
		for(int i=0; i<list1.size(); i++) {
			if((i+1)!=list1.get(i)) {
				System.out.println("The missing element in the list is: "+(i+1));
				break;
			}
		}
	
		

	}

}
