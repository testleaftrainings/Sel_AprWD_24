package week2.day3;

public class LearnMethodOverLoading {

	public void browser() {
		System.out.println("Empty input args");
	}
	
	public void browser(int version) {
		
		System.out.println("one input args :"+version);
	}
	
	void browser(int version,String name) {
		System.out.println("two input args :"+ version+" "+name);
	}
	
	public void browser(String name,int version) {
		System.out.println("two input args :"+ version+" "+name);
	}
	
	public static void main(String[] args) {
		
		LearnMethodOverLoading ol=new LearnMethodOverLoading();
		ol.browser();
		ol.browser(123);
		ol.browser(124, "edge");
		ol.browser("Chrome", 112);
	}
	
}
