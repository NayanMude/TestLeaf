package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassTutorial1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		Thread.sleep(2500);
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		Thread.sleep(1000);
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(1000);
		
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(3500);
		
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(2000);
		
		WebElement dropdown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select options1 = new Select(dropdown1);
		options1.selectByIndex(4);
		Thread.sleep(1500);
		
		WebElement dropdown2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select options2 = new Select(dropdown2);
		options2.selectByValue("IND_AEROSPACE");
		Thread.sleep(1500);
		
		WebElement dropdown3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select options3 = new Select(dropdown3);
		options3.selectByVisibleText("Partnership");
		Thread.sleep(1500);
		
		WebElement dropdown4 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select options4 = new Select(dropdown4);
		options4.selectByVisibleText("Armed Forces Pacific");
		Thread.sleep(1500);
		
		driver.close();

	}

}


