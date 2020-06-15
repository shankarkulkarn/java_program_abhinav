package com.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class TestCollection {

	public static void main(String[] args) {
		
		  Collection<Integer> list = new TreeSet<Integer>();
		  System.out.println(list.size());
		  list.add(1001);
		  list.add(3001);
		  list.add(101);
		  list.add(2001);
		  list.add(201);list.add(201);
		 // list.add(2,901);
		  System.out.println(list.size());
		  //System.out.println(list);
		 // System.out.println(list.get(1));
		 // int num = list.remove(2);
		 // System.out.println(num);
		  System.out.println(list.size());
		  
		  for(int i=0; i<list.size();i++)
		  {
			  //System.out.print( list.get(i)+"  ");
		  }
		  
System.out.println("\n**********************************");

         for(int n : list)
         {
        	 System.out.print(n+"  ");
         }
	}

}
