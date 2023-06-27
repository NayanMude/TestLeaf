package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLeads {

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
		
		driver.findElement(By.xpath("//li/a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//div[@id='x-form-el-ext-gen248']/input")).sendKeys("Sachin");
		driver.findElement(By.xpath("//em/button[@id='ext-gen334']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).click();
		
		String title1 = driver.getTitle();
		System.out.println("The title of the resulting page is: "+title1);
		
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text() ='Edit']")).click();
		
		WebElement companyName = driver.findElement(By.xpath("//tr//input[@name='companyName']"));
		companyName.clear();
		String expectedName = "Company 8 Ltd.";
		companyName.sendKeys(expectedName);
		
		driver.findElement(By.xpath("(//tr//input[@name='submitButton'])[1]")).click();
		String actualName = driver.findElement(By.xpath("//tr//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println("The updated Company name is: "+actualName);
		
				
		
		driver.close();
		
		

	}

}
