package week4.day1;

public class Palindrome {
public static void main(String[] args) {
	String text="madam";
	//m,a,d,a,m
	//Initialize an empty String
	String rev="";
	//converted the String into character by using toCharArray()
	char[] charArray= text.toCharArray();

	//Iterate the character from charArray
	 for (int i =charArray.length -1;i>=0; i--){
	     rev=rev+charArray[i];
	}
	// to check the String is palindrome
	// If it is match the given String is palindrome , if not not a palindrome
	if(text.equals(rev)){
	System.out.println("The given String is palindrome");
	}
	else{
	System.out.println("The given String not  is palindrome");

	}

	}
	}
