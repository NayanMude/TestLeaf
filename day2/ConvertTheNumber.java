package week1.day2;

public class ConvertTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = -24;
		if(num>0) {
			System.out.println("The given number: "+num+" is positive.");
		}
		else if(num==0) {
			System.out.println("The given number: "+num+" is neither positive nor negative.");
		}
		else {
			System.out.println("The given number: "+num+" is negative.");
			num=(-1)*num;
			System.out.println("The number is converted to its positive form as: "+num);
		}

	}

}