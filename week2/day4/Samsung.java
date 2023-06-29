package week2.day4;

public class Samsung extends AndroidTV{
	
	
	

	public void playVideo() {
		System.out.println("The missing method is being played with video here.");
		
	}

	public static void main(String[] args) {
		Samsung s = new Samsung();
		s.openApp();
		s.playVideo();

	}
		
	}

