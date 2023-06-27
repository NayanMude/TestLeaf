package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpathTutorial {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		
		
		driver.findElement(By.xpath("//div[@id='username_container']/input")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//form[@id='login_form']/input")).sendKeys("Leaf@1234");
		driver.findElement(By.xpath("//form[@id='login_form']/input[@id='Login']")).click();
		Thread.sleep(2000);
		
		
		driver.close();

	}

}
