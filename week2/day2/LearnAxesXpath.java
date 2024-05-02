package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAxesXpath {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//div[@id='username_container']/input")).sendKeys("hari.readhakrishan@qeagle.com");
		driver.findElement(By.xpath("//div[@id='theloginform']//input[@id='password']")).sendKeys("Qeagle@123");
		driver.findElement(By.id("Login")).click();
		//driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input"))
	}

}
