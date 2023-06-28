package week2.day3;

public class PolyMorphismExample1 {

	public void add(int a, int b) {
		System.out.println(a+b);			
	}
	
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public void add(int a, float b) {
		System.out.println(a+b);
	}
	public void add(float a, int b) {
		System.out.println(a+b);
	}
	public void add(int age, String name) {
		System.out.println("The age of "+name+" is: "+age);
	}
	public static void main(String[] args) {
		PolyMorphismExample1 addition = new PolyMorphismExample1();
		
		addition.add(2.5f, 5);
		addition.add(12, 8.5f);
		addition.add(20, 4);
		addition.add(10, 12, 14);
		addition.add(27, "Nayan");
		
		
	}

}
