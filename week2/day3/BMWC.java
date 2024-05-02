package week2.day3;

public class BMWC extends CarP {

	public void sunroofs() {
System.out.println("BMW_C");
	}
	
	
	public void brakes() {
		System.out.println("ABS");
	}
	
	public static void main(String[] args) {
		BMWC b=new BMWC();
		b.sunroofs();
		b.engine();
		b.brakes();
		b.horn();
	}
}
