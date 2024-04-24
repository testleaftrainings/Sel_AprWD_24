package week1.day3;

public class LearnString {

	public static void main(String[] args) {

		String name="repalce all the Character in given String";
		//replace
		//all
		//the
		//character = r palc all th Charact r in giv n string
		//split("e");
		
		String[] split = name.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]);
		}
		
		//output :replacealltheCharacterinthegivenString
		
		System.out.println(" ");
		//replace
		String com="TestLeaf";
		
		String replace = com.replace('e','@');
		System.out.println(replace);
		
		//replaceAll
		String name1="Test2024";
		String replaceAll =name1 .replaceAll("[^A-Z]", "#");
		System.out.println(replaceAll);
		
		//SubString
		
		String value="Amazon Product Sales";
		
		String substring = value.substring(6);
		System.out.println(substring);
		
		//endindex -1
		//6-1=5
		String substring2 = value.substring(2, 6);
		
		System.out.println(substring2);
		
		//touppercase
		String upperCase = value.toUpperCase();
		System.out.println(upperCase);
		
		//tolowercase
		String lowerCase = value.toLowerCase();
		System.out.println(lowerCase);
		
		String price="2000";
		int parseInt = Integer.parseInt(price);
		System.out.println(parseInt);
	}

}
