package marathonsession1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemasTest {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		//Opening the URL
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Selecting the Movie Library option:
		driver.findElement(By.xpath("//div[text()='Movie Library ']")).click();
		Thread.sleep(3000);
		WebElement dropdown1 = driver.findElement(By.name("city"));
		Select city = new Select(dropdown1);
		city.selectByVisibleText("Chennai");
		
		WebElement dropdown2 = driver.findElement(By.name("genre"));
		Select genre = new Select(dropdown2);
		genre.selectByVisibleText("ANIMATION");
		
		WebElement dropdown3 = driver.findElement(By.name("lang"));
		Select language = new Select(dropdown3);
		language.selectByVisibleText("ENGLISH");
		
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='movie-list']/div[1]")).click(); //Clicks the first element displayed.
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		
		//Entering the details:
		WebElement dropdown4 = driver.findElement(By.name("cinemaName"));
		Select cinema = new Select(dropdown4);
		cinema.selectByVisibleText("SPI Escape Chennai");
		
		driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']")).click();
		driver.findElement(By.xpath("//div[@class='controls']/*[2]")).click();
		driver.findElement(By.xpath("//span[text()='6']")).click();
		
		
		WebElement dropdown5 = driver.findElement(By.name("timings"));
		Select timings = new Select(dropdown5);
		timings.selectByIndex(3);
		
		driver.findElement(By.name("noOfTickets")).sendKeys("3");
		driver.findElement(By.name("name")).sendKeys("Sachin");
		driver.findElement(By.name("email")).sendKeys("sachin.kohli@gmail.com");
		driver.findElement(By.name("mobile")).sendKeys("8945761258");
		
		WebElement dropdown6 = driver.findElement(By.name("food"));
		Select food = new Select(dropdown6);
		food.selectByIndex(1);
		
		driver.findElement(By.name("comment")).sendKeys("NIL");
		driver.findElement(By.xpath("//span[text()='Copy To Self']")).click();
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		driver.findElement(By.xpath("//button[@aria-label='Close this dialog']")).click();
		
		//Verifying the Title of the page:
		String title = driver.getTitle();
		System.out.println("The title of the webpage is: "+title);
		
		//Closing the browser:
		driver.close();		

	}

}
