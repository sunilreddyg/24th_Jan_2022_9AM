package mq.java.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set_Interface_TreeSet {

	public static void main(String[] args) {
		
		/*
		 * Set:-->
		 * 		=> Set is a collection interface class
		 * 		=> Set store unorder group of objects
		 * 		=> Set doesn't allow duplicate values to store
		 */
		
		
		Set<String> set=new TreeSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		set.add("six");
		set.add("two");
		
		//Remove object from collection
		set.remove("three");
	
		//Get Object COunt
		int Count=set.size();
		System.out.println("Object Count is --> "+Count);
		
		//Verify Object Contains at Collection
		boolean flag=set.contains("three");
		System.out.println("Object available is -->  "+flag);
		
		
		//Read First interator object
		String FirstObject=set.iterator().next();
		System.out.println(FirstObject);
		
		//Clear all coolection
		//set.clear();
		
		//Verify Collection Empty status
		boolean flag1=set.isEmpty();
		System.out.println("Collection empty status is -->  "+flag1);

		
		//Read Collection object using foreach loop
		for (String eachobj : set) 
		{
			System.out.println(eachobj);
		}
		
		
		//Read all objects using while loop
		Iterator<String> itr=set.iterator();
		System.out.println(itr.next());
		System.out.println(itr.next());
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
