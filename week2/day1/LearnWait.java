package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWait {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//selenium wait -its common for all findElement method
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("dilip");
		
		//methods
		String text = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		
		System.out.println(text);
		if(text.contains("Democsr")) {
			System.out.println("Successfully account created");
		}else {
			System.out.println("Account is not created");
		}
	}

}
