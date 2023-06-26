package week1.day3;

public class ReverseEvenString {

	public static void main(String[] args) {
			String test = "I am a Software Tester";
			String testArr[]=test.split(" ");
			for(int i=0; i<testArr.length; i++) {
				String words = testArr[i];
				if(i%2==0) {
					char[] letters = words.toCharArray();
					for(int j=letters.length-1; j>=0; j--) {
						System.out.print(letters[j]);
					}
					System.out.print(" ");
				}
				else {
					System.out.print(words+" ");
				}
			}

	}

}
