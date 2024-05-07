package week3.day2;

public class ConstructorChaining {

	public ConstructorChaining() {
		System.out.println(" its default one");
	}
	
	public ConstructorChaining(int a) {
		this();
		System.out.println(a);
	}
	
	public ConstructorChaining(int a,int b) {
		this(6);
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
	ConstructorChaining ch=new ConstructorChaining(2,6);
	}
}
