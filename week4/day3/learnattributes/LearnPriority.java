package learnattributes;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LearnPriority {
@BeforeMethod
public void pre() {
	System.out.println("Precondition");
}
@AfterMethod
public void post() {
	System.out.println("Postcondition");
}
	@Test
	public void add() {
		System.out.println("Addition");
	}
	@Test(priority = 2)
	public void sub() {
		System.out.println("Subraction");
	}
	@Test(priority = 3)
	public void mul() {
		System.out.println("Multiplication");
	}
	@Test
	public void div() {
		System.out.println("Division");
	}
}
