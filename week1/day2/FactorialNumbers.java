package week1.day2;

public class FactorialNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 7;
		int fact = 1;
		for(int i=1; i<=num; i++){
			fact = fact*i;
		}
		System.out.println("The factorial of the number "+num+" is: "+fact);
	}

}
