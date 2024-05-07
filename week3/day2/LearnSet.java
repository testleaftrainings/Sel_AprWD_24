package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		
		int[] num= {23,45,23,34,89,76,45,67};
		
		Set<Integer> unq=new HashSet<Integer>();
		
		for (Integer i : num) {
			unq.add(i);
		}
		System.out.println(unq);
		
		//set - will not use collections.sort() -will use TreeSet
		
		//convert set into list
		List<Integer> getValue=new ArrayList<Integer>(unq);
		
		Integer number = getValue.get(4);
		System.out.println(number);

	}

}
