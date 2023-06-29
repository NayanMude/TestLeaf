package week2.day4;

public class Automation extends MultipleLanguage {

	
	public void Selenium() {
		System.out.println("Selenium tool is used here.");
		
	}

	public void Java() {
		System.out.println("Java language is used here.");
		
	}

	@Override
	public void ruby() {
		System.out.println("The language Ruby is used here.");
		
	}
	
	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.Java();
		auto.Selenium();
		auto.python();
		auto.ruby();

	}

}
