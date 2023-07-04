package week3.day1;

public class ConstructorPractice {
	
	int num;
	String name;
	
	public ConstructorPractice() {
		System.out.println("This is a default constructor.");
		num = 45;
		name = "BCCI";
		System.out.println(num+" "+name);
	}
	public ConstructorPractice(int num, String name) {
		this();
		System.out.println("Parameterized Constructor");
		this.num = num;
		this.name = name;
		System.out.println("Age is "+num+" name: "+name+" ");
	}
	public ConstructorPractice(String OrgName) {
		this(27, "Virat");
		System.out.println(OrgName);
	}
	public static void main(String[] args) {
		ConstructorPractice cp = new ConstructorPractice("BCCI");
	}

}
