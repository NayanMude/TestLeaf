package marathonsession1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBusTest {

	public static void main(String[] args) throws InterruptedException  {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//a[text()='Bus'])[2]")).click();
		//Selecting the Source City:
		driver.findElement(By.id("source")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		//Selecting the Destination City:
		driver.findElement(By.id("destination")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		//Selecting the Date:
		driver.findElement(By.id("datepicker1")).click();
		driver.findElement(By.xpath("(//a[text()='1'])")).click();
		//Search Operation:
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		String busTitle1 = driver.findElement(By.xpath("(//div[@class='search-column1']/h2)[1]")).getText();
		System.out.println("The bus that appears first after searching is: "+busTitle1);
		//Filtering out the options:
		driver.findElement(By.id("Bustypes4")).click();
		String busTitle2 = driver.findElement(By.xpath("(//div[@class='search-column1']/h2)[1]")).getText();
		System.out.println("The bus that appears first after filtering is: "+busTitle2);
		//Getting the number of seats available:
		String noOfSeats = driver.findElement(By.xpath("(//div[@class='search-column2-col1']/p)[1]")).getText();
		System.out.println("The bus shows "+noOfSeats);
		//Selecting the seats:
		driver.findElement(By.xpath("//span[text()='Select Seat']")).click();
		driver.findElement(By.id("UO4-5ZZ")).click();
		String seatNo = driver.findElement(By.id("seatnos")).getText();
		System.out.println("The selected seat number is: "+seatNo);
		String fare = driver.findElement(By.id("ticketfare")).getText();
		System.out.println("The total ticket fare is: "+fare);
		//Selecting Boarding Point and Dropping Point:
		WebElement dropdown1 = driver.findElement(By.id("boardingpoint_id"));
		Select boardingPt = new Select(dropdown1);
		boardingPt.selectByIndex(5);
		Thread.sleep(1500);//Thread.sleep used only to verify whether the correct option is chosen or not.
		WebElement dropdown2 = driver.findElement(By.id("droppingpoint_id"));
		Select droppingPt = new Select(dropdown2);
		droppingPt.selectByIndex(5);
		Thread.sleep(2500);//Thread.sleep used only to verify whether the correct option is chosen or not.
		//Verify the Title of the Web page:
		String title = driver.getTitle();
		System.out.println("The title of the web page is: "+title);
		//Closing the browser:
		driver.close();
		
	}

}
