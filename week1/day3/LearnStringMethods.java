package week1.day3;

public class LearnStringMethods {

	public static void main(String[] args) {

		String companyName="Test Leaf";
		
		String com="test leaf";
		
		String value=new String("Test Leaf");
		
		//length()
		int length = companyName.length();
		System.out.println("Length of the string :"+length);
		
		//equals()
		if(companyName.equals(value)) {
			System.out.println(".equals() Its equal");
		}else {
			System.out.println(".equals() its not equal ");
		}
		
		//what diff b/w  equals() & ==
		if(companyName==value) {//it will compare memory value
			System.out.println("== Its equal");
		}else {
			System.out.println("== its not equal ");
		}
		
		//equalsIgnoreCase
		if(com.equalsIgnoreCase(value)){
			System.out.println(".equalsIgnoreCase() Its equal");
		}else {
			System.out.println(".equalsIgnoreCase its not equal ");
		}
		
		//contains
		String name="Dilip";
		boolean contains = name.contains("I");
		System.out.println("contains() :"+contains);
		
		//charAt
		char charAt = name.charAt(2);
		System.out.println(charAt);
		
		//tocharArray
		String c="Selenium";
		
		char[] ch = c.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		
		System.out.println(" ");
		
		//Reverse the String value
		String data="Automation";
		//noitamotuA
		//we need convert string to tocahrArray
		//reverse for loop
		
		char[] ch1 = data.toCharArray();
		for (int i = ch1.length-1; i >=0 ; i--) {
			System.out.print(ch1[i]);
		}
	}

}
