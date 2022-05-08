package com.chitti.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collection1  {
	public static void main(String[] args) {
		Collection collection=new ArrayList();
		
		collection.add("Pradeep");
		collection.add(9036455410l);
		collection.add("India");
		System.out.println(collection.size());
	
		for (Object object : collection) {
			System.out.println(object);
			
			
			System.out.println(((ArrayList) collection).lastIndexOf("Pradeep"));
			System.out.println(collection.size());
		
			
		}

	}
	}
