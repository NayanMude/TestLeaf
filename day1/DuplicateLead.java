package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("http://leaftaps.com/opentaps/control/login");
						
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
						
			driver.findElement(By.id("password")).sendKeys("crmsfa");
						
			driver.findElement(By.className("decorativeSubmit")).click();
						
			driver.findElement(By.linkText("CRM/SFA")).click();
						
			driver.findElement(By.linkText("Leads")).click();
						
			driver.findElement(By.linkText("Create Lead")).click();
						
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Company 1 Ltd.");
			
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sachin");
			
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kohli");
			
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Robin");
			
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
			
			driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Automation Tester");
			
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sachin.kohli@gmail.com");
			
			driver.findElement(By.xpath("//input[@value = 'Create Lead']")).click();
			
			String title1 = driver.getTitle();
			System.out.println("The title for page 1: "+title1);
			
			driver.findElement(By.xpath("//a[text() = 'Duplicate Lead']")).click();
			
			driver.findElement(By.id("createLeadForm_companyName")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Company 2 Ltd.");
			
			driver.findElement(By.id("createLeadForm_firstName")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Yuvraj");
			
			driver.findElement(By.xpath("//input[@value = 'Create Lead']")).click();
			
			String title2 = driver.getTitle();
			System.out.println("The title for page 2 is: "+title2);
			
			
	}

}
