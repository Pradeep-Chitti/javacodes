package com.chitti.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest {
	public static void main(String[] args) {
		Collection collection =new ArrayList();
		
		collection.add(20);
		collection.add("Pradeep");
		collection.add(9886255410l);
		collection.add("Virat Kohli");
		collection.add(1);
		collection.add(9036455410l);
		collection.add(20.25f);
		collection.add("Ganesh");
		System.out.println(collection.size());
		collection.remove(20);
		System.out.println(collection.size());
		
		
		
		//fetching the object from class
		//System.out.println("fetching the object from class");

		//for each
	for(Object object:collection) {
			
		System.out.println(object);                                //We can use one type using fetching data for and foreach
	}
		
		collection.forEach(System.out::println);                 //this is also using fetching the data
	}

}
