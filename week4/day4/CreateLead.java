package week4.day4;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends BaseClass{

	@Test(dataProvider = "fetchData")
	public  void runCreateLead(String companyName,String firstName,String lastName) {
		
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.name("submitButton")).click();		
}
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		ReadExcel excel=new ReadExcel();
		String[][] data = excel.readData();
		
		                        //row size and column size
//		String[][] data=new String[3][3];
//		data[0][0]="TestLeaf";
//		data[0][1]="Aravind";
//		data[0][2]="R";
//		data[1][0]="Infosys";
//		data[1][1]="Raghu";
//		data[1][2]="G";
//		data[2][0]="Qeagle";
//		data[2][1]="Muthu";
//		data[2][2]="S";
		
		return data;
	}


}






