package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPrice {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phone",Keys.ENTER);
		List<WebElement> phone = driver.findElements(By.className("a-price-whole"));
		//size phone price
		int phonePrice = phone.size();
		System.out.println(phonePrice);
		//empty list 
		List<Integer> num=new ArrayList<Integer>();
		
		for (WebElement price : phone) {
			String prices = price.getText();
			
			//remove the ','
			String replace = prices.replace(",", "");
			//System.out.println(replace);
			//String to Integer
			int parseInt = Integer.parseInt(replace);
			System.out.println(parseInt);
			num.add(parseInt);
		}
		System.out.println(num);
		
		//convert list in to set
		//set 
		Set<Integer> unq=new TreeSet<Integer>(num);
		System.out.println("It will remove Duplicate values :"+unq +"\n"+ unq.size());
		
		/*
		 * Collections.sort(num);
		 * Integer minValue = num.get(0);
		 * System.out.println("Min value price :"+minValue);
		 */
		
		driver.close();
	}

}
