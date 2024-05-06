package week3.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindElements {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		//return type for findElements -list of webelement
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int linkSize = links.size();
		
		System.out.println("total number of links :" +linkSize);
		
		for (WebElement i : links) {
			String text = i.getText();
			System.out.println(text);
			
		}
	}

}
