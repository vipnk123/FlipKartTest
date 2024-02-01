package Demo1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {

		@Test
		public void SearchFlipTest() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.flipkart.com/");
			Thread.sleep(3000);
			
			WebElement stf = driver.findElement(By.name("searchVal"));
			Thread.sleep(3000);
			stf.sendKeys("perfume");
			stf.sendKeys(Keys.ENTER);
			
			WebElement perfume = driver.findElement(By.xpath("//div[text()='Femme Sky Blue Eau De Parfum']/parent::div[@class='contentHolder']"));
		    System.out.println(perfume.getText());
		}

}
