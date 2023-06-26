package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLeads {

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
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Company 1 Ltd.");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nayan");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mude");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nayan.mude@gmail.com");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7387978255");
		
		Thread.sleep(5000);
		
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(2500);
		
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		Thread.sleep(2500);
		
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Company 2 Ltd.");
		Thread.sleep(2500);
		
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2500);
		driver.close();
		
	}

}

