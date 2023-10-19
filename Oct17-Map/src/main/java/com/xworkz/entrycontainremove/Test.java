package com.xworkz.entrycontainremove;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Test {
	public static void main(String[] args) {
		Map<Integer, String> entry=new HashMap<Integer, String>();
		entry.put(14,"tomato");
		entry.put(30, "Bottle guard");
		entry.put(20, "Beans");
		entry.put(40, "onion");
		
		boolean key=entry.containsKey(20);
		System.out.println(key);
		
		
		
		Set set=entry.entrySet();
		java.util.Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> temp=(Map.Entry<Integer, String>)itr.next();
			System.out.println(temp.getKey()+"="+temp.getValue());
		}
	}
	
	

}
