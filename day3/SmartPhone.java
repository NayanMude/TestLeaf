package week2.day3;

public class SmartPhone extends AndroidPhone {
	
	public void takeVideo() {
		System.out.println("The video is being taken.");
	 }
	
	
	public static void main(String[] args) {
		 
		SmartPhone sp = new SmartPhone();
		sp.takeVideo();

	}

}
