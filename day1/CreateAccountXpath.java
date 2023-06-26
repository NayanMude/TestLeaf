package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountXpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.xpath("//input[@id = 'accountName']")).sendKeys("Debit Limited Account");
		driver.findElement(By.xpath("//textarea[@name = 'description']")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id = 'groupNameLocal']")).sendKeys("LocalGroupOne");
		driver.findElement(By.xpath("//input[@id = 'officeSiteName']")).sendKeys("SiteName1");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("5,00,000");
		
		WebElement dropdown1 = driver.findElement(By.name("industryEnumId"));
		Select option1 = new Select(dropdown1);
		option1.selectByIndex(2);
		
		WebElement dropdown2 = driver.findElement(By.name("ownershipEnumId"));
		Select option2 = new Select(dropdown2);
		option2.selectByVisibleText("S-Corporation");
		
		WebElement dropdown3 = driver.findElement(By.name("dataSourceId"));
		Select option3 = new Select(dropdown3);
		option3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement dropdown4 = driver.findElement(By.name("marketingCampaignId"));
		Select option4 = new Select(dropdown4);
		option4.selectByIndex(5);
		
		WebElement dropdown5 = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select option5 = new Select(dropdown5);
		option5.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@value = 'Create Account']")).click();
		
		//Using Thread sleep only to check whether all the fields are properly filled before closing the browser.
		Thread.sleep(10000);
		driver.close();
		
	}

}
