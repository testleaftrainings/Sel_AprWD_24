package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {

		int[] num= {23,45,43,21,23,56,43,22};
		
		List<Integer> val=new ArrayList<Integer>();
		
		//for each
		
		for (Integer i : num) {
			val.add(i);
		}
		System.out.println(val);
		
		Collections.sort(val);
		
		for (int i = 0; i < val.size()-1; i++) {
			if(val.get(i)==val.get(i+1)) {
				System.out.println(val.get(i+1));
			}
		}
	}

}
