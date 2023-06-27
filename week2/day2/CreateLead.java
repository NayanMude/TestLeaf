package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//label[@for='password']/following-sibling::input")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@id='password']/following::input")).click();
		
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		driver.findElement(By.xpath("//div[@class='x-panel-header']/a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//li/a[text() = 'Create Lead']")).click();
		driver.findElement(By.xpath("(//span[@class='requiredField']/following::input)[1]")).sendKeys("New Company Name 1 Ltd.");
		driver.findElement(By.xpath("//span[@class='requiredField']/following::input[@name='firstName']")).sendKeys("Rohit");
		driver.findElement(By.xpath("//span[@class='requiredField']/following::input[@name='lastName']")).sendKeys("Singh");
		
		//Thread.sleep used only for checking whether the inputs are properly entered.
		
		WebElement dropdown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select options1 = new Select(dropdown1);
		options1.selectByVisibleText("Employee");
		Thread.sleep(1500);
		
		WebElement dropdown2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select options2 = new Select(dropdown2);
		options2.selectByValue("9001");
		Thread.sleep(1500);
		
		WebElement dropdown3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select options3 = new Select(dropdown3);
		options3.selectByIndex(5);
		Thread.sleep(1500);
		
		WebElement dropdown4 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select options4 = new Select(dropdown4);
		options4.selectByVisibleText("India");
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//td/input[@name='submitButton']")).click();
		
		String title1 = driver.getTitle();
		System.out.println("The resulting page title is: "+title1);
		Thread.sleep(2000);
		
		driver.close();
	}

}
