package learnattributes;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LearnInvocationCount {

	@Test
	public void add() {
		System.out.println("Addition");
	}
	@Test
	public void sub() {
		System.out.println("Subraction");
	}
	@Test(invocationCount = 5, threadPoolSize = 2)
	public void mul() {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	
		System.out.println("Multiplication");
	}
	@Test
	public void div() {
		System.out.println("Division");
	}
}
