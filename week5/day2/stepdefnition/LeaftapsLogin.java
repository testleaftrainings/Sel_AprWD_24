package stepdefnition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeaftapsLogin extends BaseClass{
	//ChromeDriver driver;

//	@Given("Open the chrome browser")
//	public void openBrowser() {
//		driver=new ChromeDriver();
//
//	}
//          //Load the    application url
//	@And("Load the    application url")
//	public void loadApplicationUrl() {
//		driver.get("http://leaftaps.com/opentaps/control/main");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//
//	}
	@And("Enter the username as (.*)$")
	public void enterUserName(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	@And("Enter the password as (.*)$")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("Click on Login button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("HomePage should be displayed")
	public void verifyHomePage() {
		String expectResult = driver.getTitle();
		String actualResult="Leaftaps - TestLeaf Automation Platform";
		if(expectResult.equals(actualResult)) {
			System.out.println("The HomePage should be displayed");
		}else {
			System.out.println("The HomePage should not be displayed");
		}

	}

	@But("The error should be displayed")
	public void errorMsg() {
		String text = driver.findElement(By.id("errorDiv")).getText();

		System.out.println(text);
	}

}
