package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetCollectionPractice {

	public static void main(String[] args) {
		String input = "google";
		String output = "";
		
		char[] ch = input.toCharArray();
		
		Set<Character> unique = new LinkedHashSet<Character>();
		
		for(Character i:ch) {
			if(unique.add(i)) {
				output=output+i;
			}
		}
		System.out.println(output);
		System.out.println(unique);

	}

}
