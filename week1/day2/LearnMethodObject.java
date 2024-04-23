package week1.day2;

public class LearnMethodObject {

	//methodName- ctrl+space
	
	public void add() {
		System.out.println("Zero input agrs");
	}
	
	public void add(int a,int b) {
		System.out.println("with input agrs :"+a+b);
	}
	
	
	public int mul(int a,int b) {
		return a*b;
		
	}
	
	private String data(String name,int rollNo) {
		return  name +" "+rollNo;
		
	}
	
	public static void main(String[] args) {
		//ClassName objectName= new ClassName();
		LearnMethodObject mo=new LearnMethodObject();
		
		//objectName.methodName()
		
		mo.add();
		mo.add(4, 5);
		
		//way 1 -ctrl+2 -2 option
		String data = mo.data("TestLeaf", 2024);
		System.out.println(data);
		
		//way 2
		System.out.println(mo.mul(9, 3));
	}
}
