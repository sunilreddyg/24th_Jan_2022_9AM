package mq.java.Collections;

import java.util.HashMap;
import java.util.Set;

public class HashMap_Example 
{

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> map=new HashMap<Integer,String>();
		map.put(100, "Samsung");
		map.put(200, "Iphone");
		map.put(300, "Vivo");
		map.put(400, "OnePlus");
		map.put(null, "Oppo");
		
		//Read object using keyname
		String MobileName=map.get(400);
		System.out.println(MobileName);
		
		
		//Read all object using keyset
		for (Integer Eachkey : map.keySet()) 
		{
			System.out.println(map.get(Eachkey));
		}
		

	}

}
