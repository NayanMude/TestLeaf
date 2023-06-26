package week1.day3;

import java.util.Arrays;

public class OddToUpper {

	public static void main(String[] args) {
		String test = "changeme";
		char[] testArr= test.toCharArray();
		
		System.out.println("The input string before the change is:");
		System.out.println(testArr);
		
		System.out.println("The output string after the change is:");
		
		for(int i=0; i<=testArr.length-1; i++) {
			if(i%2!=0) {
				testArr[i] = Character.toUpperCase(testArr[i]);
				System.out.print(testArr[i]);	
			}
			else {
				System.out.print(testArr[i]);
			}
		}
	}
}
		

	


