package week3.day1;

public class Concrete extends SbiChennai{

	@Override
	public void withdrawal() {
		System.out.println("Above 10L");
	}

	@Override
	public void roi() {
		System.out.println("10%");
	}

	@Override
	public void Pl() {
		System.out.println("11.45%");
	}
	
	public static void main(String[] args) {
		Concrete c=new Concrete();
		c.BalLimit();
		c.kyc();
		c.Pl();
		c.roi();
		c.withdrawal();
	}

}
