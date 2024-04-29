package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeranDropDowns {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebElement dd = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		
		//select class object
		Select bt=new Select(dd);
		bt.selectByVisibleText("Selenium");
		//bt.selectByIndex(0);
		//bt.selectByValue(null);
		
		
		
		//non-select tag
		
		driver.findElement(By.xpath("//label[contains(@class,'ui-selectonemenu')]")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		
	}

}
