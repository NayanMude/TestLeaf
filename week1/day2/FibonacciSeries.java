package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum = 0;
		int secondNum = 1;
		int limit = 10;
		int sum;
		System.out.println("The Fibonacci Series till "+limit+" terms is: ");
		
		for(int i=1; i<=limit; i++){
			System.out.println(firstNum);
			sum = firstNum+secondNum;
			firstNum = secondNum;
			secondNum = sum;
			
		}
		

	}

}
