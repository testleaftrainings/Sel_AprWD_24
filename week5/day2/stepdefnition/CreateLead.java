package stepdefnition;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass{
	@When("Click on crmsfa hyper link")
	public void clickCrmsfaHyperLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@Then("MyHomePage should be displayed")
	public void verifyMyHomePage() {
		String expectResult = driver.getTitle();
		String actualResult="My Home | opentaps CRM";
		if(expectResult.equals(actualResult)) {
			System.out.println("The MyHomePage should be displayed");
		}else {
			System.out.println("The MyHomePage should not be displayed");
		}
	}

	@When("click on leads tap")
	public void clickLeadsTap() {
		driver.findElement(By.linkText("Leads")).click();
	}
    @Then("MyLeadsPage should be displayed")
	public void verifyMyLeadsPage() {
    	String expectResult = driver.getTitle();
		String actualResult="My Leads | opentaps CRM";
		if(expectResult.equals(actualResult)) {
			System.out.println("The MyLeadsPage should be displayed");
		}else {
			System.out.println("The MyLeadsPage should not be displayed");
		}
	}

    @When("Click on create Lead button")
	public void clickCreateLeadButton() {
    	driver.findElement(By.linkText("Create Lead")).click();
	}

    @Then("CreateLead pages should be displayed")
	public void verifyCreateLeadPage() {
    	String expectResult = driver.getTitle();
		String actualResult="Create Lead | opentaps CRM";
		if(expectResult.equals(actualResult)) {
			System.out.println("The CreateLeadpage should be displayed");
		}else {
			System.out.println("The CreateLeadpage should not be displayed");
		}
	}

    @Given("Enter the companyName as (.*)$")
	public void enterCompanyName(String companyName) {
    	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	}
//    @Given("Enter the companyName as (.*)$")
//  	public void enterCompanyName1(String companyName) {
//      	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
//  	}
   // {string}
    @And("Enter the FirstName as (.*)$")
	public void enterFirstName(String firstName) {
    	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}
    @And("Enter the LastName as (.*)$")
	public void enterLastName(String lastName) {
    	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}
    @When("Click on CreateLead submit button")
	public void clickSubmitButton() {
    	driver.findElement(By.name("submitButton")).click();
	}

    @Then("ViewLeadPage should be displayed")
	public void verifyViewLeadPage() {
    	String expectResult = driver.getTitle();
		String actualResult="View Lead | opentaps CRM";
		if(expectResult.equals(actualResult)) {
			System.out.println("The ViewLeadpage should be displayed");
		}else {
			System.out.println("The ViewLeadpage should not be displayed");
		}
	}
}
