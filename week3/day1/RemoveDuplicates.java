package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String name = "Paypal India";
		String output = " ";
		char[] ch = name.toCharArray();
		System.out.println(ch);
		
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		
		for(char i: ch) {
			if(!charSet.add(i)) {
				dupCharSet.add(i);
			}
		}
		charSet.removeAll(dupCharSet);
		for(char i: charSet) {
			if(i!=' ') {
				System.out.println(i);
			}
		}
	}

}
