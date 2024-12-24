package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.List;

public class CollectionsFramework {

	public static void main(String[] args) {
		
		
		String[] empNames = new String[3];
		empNames[0] = "Amit";
		empNames[1] = "Anurag";
		empNames[2] = "Devi";
//		empNames[3] = "Bharath";
		
		int [] empIds = new int [3];
		empIds[0] = 1234;
		empIds[1] = 1235;
		empIds[2] = 1236;
		
		System.out.println(empNames[0]);
		System.out.println(empIds[0]);
		
		System.out.println(empNames.length);
		System.out.println(empIds.length);
		
		//Challenges with Array
//		1. Fixed Length
//		2. Static memory allocation at the begining
//		3. similar data types
//		4. modifications not allowed
		
		//1. No need to specify the size of values while creating/initializing collections
		//2. It follows dynamic memory allocation
		//3. Collections allow multiple data types together stored at one place
		//4. Collections allows modifications
		
		//5. There are so many inbuilt functions/ utilities to manipulate the data /filter the data
		
		
		// List ==> ArrayList, LinkedList
			//	List can store multiple values with similar datatype together
			//	List can store duplicate values
			//	List follows dynamic memory allocation
			//  List allows modifications
		
		// Set  ==> HashSet, LinkedHashSet and TreeSet
			//	Set can store multiple values with similar datatype together
			//	Set cannot store duplicate values
			//	Set follows dynamic memory allocation
			//  Set allows modifications			
		
		// Map  ==> HashMap, LinkedHashMap, TreeMap and Hashtable
			//	Map can store multiple values with different datatypes together in the form of Key and Value
			//	Map can store duplicate values but won't allow duplicate Keys
			//	Map follows dynamic memory allocation
			//  Map allows modifications
		
		//differences between each collection concept
		
		// 1. Order of storing values
		// 2. Allowing null values
		// 3. Memory allocation
		
		
		//Wrapper Classes ==> 
		
		/******************************************** ArrayList ******************************************/
		//Syntax to initialize: List<DataType> variable = new ArrayList<DataType>(); //collections allows only non-primitive data types
		//Syntax to add value: variable.add(value);
		//Syntax to remove value: variable.remove(value);
		//Syntax to access the value: variable.get(index);
		//Syntax to get total values: variable.size();
		
		System.out.println("*************** ArrayList ***************");
		List<String> empNamesArrayList = new ArrayList<String>();
		empNamesArrayList.add("Amit");
		empNamesArrayList.add("Anurag");
		empNamesArrayList.add("Devi");
		empNamesArrayList.add("Amit");
		empNamesArrayList.add("Bharath");
		empNamesArrayList.add(null);
		empNamesArrayList.remove("Bharath");
		System.out.println("Total Values in ArrayList are :"+empNamesArrayList.size());
		System.out.println(empNamesArrayList);
	}

}
