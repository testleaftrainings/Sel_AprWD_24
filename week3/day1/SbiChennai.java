package week3.day1;

public abstract class SbiChennai implements RBI{

	//i can have both implement and unimplements
	//0 to 100% abstract method
	//one abstract methods
	@Override
	public void kyc() {
		System.out.println("Pan Card");
		
	}
	public void BalLimit() {
		System.out.println("Min 1000rs");
	}
	
	public abstract void Pl();
	
	public static void main(String[] args) {
		
		//for interface we can able create object - NO
	//	RBI r=new RBI();
		
		//for abstract class we can able create object - NO
		//SbiChennai c=new SbiChennai();
	}
	
}
