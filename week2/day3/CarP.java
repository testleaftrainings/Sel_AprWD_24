package week2.day3;

public class CarP extends VehicleGP{

	public void engine() {

		System.out.println("Car -p");
	}
	
	public static void main(String[] args) {
		CarP c=new CarP();
		
		c.engine();
		c.brakes();
		c.horn();
	}
}
