package marathonsession1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Search:
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags");
		driver.findElement(By.xpath("//span[text()=' for boys']")).click();
		//Number of results:
		String results = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println("The results displayed are: "+results);
		//Brand Filters:
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i[@class='a-icon a-icon-checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i[@class='a-icon a-icon-checkbox'])[2]")).click();
		//Sorting the results:
		driver.findElement(By.className("a-dropdown-label")).click();
		driver.findElement(By.id("s-result-sort-select_4")).click();
		//Getting the details of the results:
		String results1 = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-base a-text-center'])[2]//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']")).getText();
		System.out.println("The name of the 1st product is: "+results1);
		//Getting the price of the 1st product:
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("The discounted price of the 1st product is: "+price);
		//Getting the page title:
		String title = driver.getTitle();
		System.out.println("The title of the page is: "+title);
		//Close the browser:
		driver.close();
		

	}

}
