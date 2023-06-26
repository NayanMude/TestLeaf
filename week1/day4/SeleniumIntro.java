package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		Thread.sleep(2000);
		
		driver.findElement(By.id("Login")).click();
		Thread.sleep(5000);
		
		driver.close();

	}

}
