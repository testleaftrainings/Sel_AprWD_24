package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSnapShot {
public static void main(String[] args) throws IOException {
	ChromeDriver driver =new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	
	File source = driver.getScreenshotAs(OutputType.FILE);
	File destination=new File("./snapshot/001.png") ;
	FileUtils.copyFile(source, destination);
	
	
	//If i want to take particular element
	WebElement ele = driver.findElement(By.className("decorativeSubmit"));
	
	File source1 = ele.getScreenshotAs(OutputType.FILE);
	File destination1=new File("./snapshot/002.png") ;
	FileUtils.copyFile(source1, destination1);
}
}
