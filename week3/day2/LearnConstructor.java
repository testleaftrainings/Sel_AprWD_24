package week3.day2;

public class LearnConstructor {

	int idNo;
	String companyName;
	//accessmodifier  className(){}
	
	//default constructor
	public  LearnConstructor() {
		System.out.println("its Default Constructor");
	}
	
	//parametrized constructor
	
	public LearnConstructor(int idNo,String companyName) {
		this.idNo=idNo;
		this.companyName=companyName;
	}
	public LearnConstructor(int a) {
	
		System.out.println(a);
	}
	//constructor chaining 
	public static void main(String[] args) {
		LearnConstructor lc=new LearnConstructor();
		
		System.out.println("default value for int :"+lc.idNo);
		System.out.println("default value for String :"+lc.companyName);
		
		LearnConstructor lc2=new LearnConstructor(25,"TestLeaf");
		
		System.out.println("parametrized value for int :"+lc2.idNo);
		System.out.println("parametrized value for String :"+lc2.companyName);
		
		LearnConstructor lc3=new LearnConstructor(25);

		
	}
	
	
}
