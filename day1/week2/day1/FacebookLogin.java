package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("Sachin");
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("Kohli");
		driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("7510051100");
		driver.findElement(By.xpath("//input[@name = 'reg_passwd__']")).sendKeys("India@2011");
		
		WebElement dropdown1 = driver.findElement(By.id("day"));
		Select options1 = new Select(dropdown1);
		options1.selectByValue("24");
		
		WebElement dropdown2 = driver.findElement(By.id("month"));
		Select options2 = new Select(dropdown2);
		options2.selectByIndex(10);
		
		WebElement dropdown3 = driver.findElement(By.id("year"));
		Select options3 = new Select(dropdown3);
		options3.selectByValue("1995");
		
		driver.findElement(By.xpath("//label[text() = 'Female']")).click();
		//Using Thread sleep only to check whether all the fields are properly filled before closing the browser.
		Thread.sleep(2500); 
		
		driver.close();
		
		
		

	}

}
