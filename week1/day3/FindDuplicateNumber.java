package week1.day3;

import java.util.Arrays;

public class FindDuplicateNumber {

	public static void main(String[] args) {

		int[] value= {23,14,35,67,87,54,34,35,87,21};
		
		//2 -for loop(nested for loop)
	//if condition to compare value
		
		
		//23//14
		for (int i = 0; i < value.length; i++) { //outer loop
			
			//14,35......21
			//35......21
			for (int j = i+1; j < value.length; j++) { //inner loop
				
				if(value[i]==value[j]) {
					
					System.out.println("Duplicate Value is "+value[j]);
				}
			}
		}
		
		
		System.out.println("*************************************");
		
		//sort this array
		//23,14,35,67,87,54,34,35,87,21
		//14,21,23,34,35,35,54,67,87,87
		//for loop
		//a[i]==a[i+1]==>a[4]==a[5]
		
		Arrays.sort(value);
		for (int i = 0; i < value.length-1; i++) {
			//value[9]==value[10]
			if(value[i]==value[i+1]) {
				System.out.println(value[i+1]);
			}
		}
		
		
		
	}

}
