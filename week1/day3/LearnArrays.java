package week1.day3;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		
		int[] marks= {34,56,43,59,20};
		
		
		//length of the array
		int length = marks.length;
		System.out.println("Length of the array :"+length);
		//value
		System.out.println("print index value of 3 :"+marks[3]);

		//print last value
		//[5-1]=[4]
		System.out.println("Last inedx value :"+marks[length-1]);
		
		//sort
		Arrays.sort(marks);
		//20,34,43,56,59
		System.out.println("After sorting index of 4 :"+marks[4]);
		
		//print all values
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
			
		}
		//5,4,3,2,1,0
		//5-1=4,4-1=3,3-1=2,2-1=1,1-1=0
		for (int i =marks.length-1 ; i >=0; i--) {
			System.out.println(marks[i]);
			
		}
	}

}
