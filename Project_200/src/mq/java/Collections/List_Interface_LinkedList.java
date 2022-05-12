package mq.java.Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class List_Interface_LinkedList {

	public static void main(String[] args) 
	{
		

		/*
		 * List:-->
		 * 			list is a collection interface class
		 * 			list of group of objects inorder
		 * 			And list accept duplicates to store
		 */
		
		
		List<String> list=new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("six");
		list.add("two");
		
		
		//Get any single object from list using index number
		String Object=list.get(3);
		
		System.out.println("3rd index object is -->  "+Object);
		//Remove object from collection
		list.remove("three");
	
		//Get Object COunt
		int Count=list.size();
		System.out.println("Object Count is --> "+Count);
		
		//Verify Object Contains at Collection
		boolean flag=list.contains("three");
		System.out.println("Object available is -->  "+flag);
		
		
		//Read First interator object
		String FirstObject=list.iterator().next();
		System.out.println(FirstObject);
		
		//Clear all coolection
		//list.clear();
		
		//Verify Collection Empty status
		boolean flag1=list.isEmpty();
		System.out.println("Collection empty status is -->  "+flag1);

		
		//Read all objects using for loop
		for (int i = 0; i < list.size(); i++) 
		{
			//Get Each Object using index wist
			String EachObject=list.get(i);
			System.out.println(EachObject);
		}
		
		
		//Read all objects using foreach loop
		for (String IndexObject : list) 
		{
			System.out.println("+"+IndexObject);
		}
		
		
		//Read all objects using while loop
		Iterator<String> itr=list.iterator();
		System.out.println(itr.next());
		System.out.println(itr.next());
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		

	}

}
