package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {

		//list syntax
		List<String> mentors=new ArrayList<String>();
		mentors.add("Vinoth");
		mentors.add("Vineeth");
		mentors.add("Gokul");
		mentors.add("Ragu");
		
		System.out.println("List of mentor: "+mentors);
		
		//remove
		mentors.remove(1);
		System.out.println("After remove :" +mentors);
		
		//add new name
		mentors.add("Dilip");
		System.out.println("New name added :"+mentors);
		
		//add with index value
		mentors.add(1, "Dilip");
		System.out.println("add with index value: "+mentors);
		
		//get
		String indexValue = mentors.get(2);
		System.out.println("get value :"+indexValue);
		
		//contains
		boolean contains = mentors.contains("Vineeth");
		System.out.println("contains method :"+contains);
		
		//sort order
		Collections.sort(mentors);
		System.out.println("Sort the list : "+mentors);
		
		//for loop
		for (int i = 0; i < mentors.size(); i++) {
			String string = mentors.get(i);
			System.out.println(string);
		}
		
		//collection- no need of inl ,cond,inc/dec
		//advance for loop
		
		/*
		 * for (String i : mentors) { mentors.get(i);
		 * 
		 * }
		 */
		
		//clear
		mentors.clear();
		System.out.println(mentors);
	}

}
