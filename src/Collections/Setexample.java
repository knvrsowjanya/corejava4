package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Setexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set1 = new HashSet<String>();
		
		set1.add("jake");
		set1.add("lakshmi");
		set1.add("lakshmi");
		set1.add("prasad");
		set1.add(null);
		
		System.out.println(" the set is " + set1);
		
		TreeSet<String> set2 = new TreeSet<String>();
		
		set2.add("jockey");
		set2.add("kamala");
		set2.add("apple");
		
		System.out.println(" the list of tree set is " + set2);
		
		//used to convert the set to list
		ArrayList<String> list1 = new ArrayList<String>(set1);
		
		System.out.println(list1);
		

	}

}
