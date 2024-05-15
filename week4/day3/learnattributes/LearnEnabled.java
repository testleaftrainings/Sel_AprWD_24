package learnattributes;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LearnEnabled {

	@Test
	public void add() {
		System.out.println("Addition");
	}
	@Test
	public void sub() {
		System.out.println("Subraction");
	}
	@Test(enabled = false)
	public void mul() {
		System.out.println("Multiplication");
	}
	@Test
	public void div() {
		System.out.println("Division");
	}
}
