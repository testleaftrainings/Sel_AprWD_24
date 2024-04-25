package week1.day4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//step -1 launch the browser
		//ChromeDriver driver=new ChromeDriver();
		EdgeDriver driver=new EdgeDriver();

	//step -2 load the url
		driver.get("https://www.leafground.com/dashboard.xhtml");
		//step -3
		driver.manage().window().maximize();
		
		//step -4
		driver.close();
	}

}
