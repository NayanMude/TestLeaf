package week1.day3;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		String name = "Amazon";
		int length = name.length();
		
		System.out.println("The string is: "+name);
		
		System.out.println("The reversed string is: ");
		for(int i=(length-1); i>=0; i--) {
			System.out.print(name.charAt(i));
		}
		}
	
	}


