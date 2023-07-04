package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String input = "nayan";
		String output = " ";
		
		char[] ch = input.toCharArray();
		
		Set <Character> unique = new LinkedHashSet<Character>();
		
		for(char i: ch) {
			if(unique.add(i)) {
				output+=i;
			}
		}
		
		System.out.println("The unique characters in the input are: "+unique);

	}

}
