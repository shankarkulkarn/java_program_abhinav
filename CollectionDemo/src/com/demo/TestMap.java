package com.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {

           Map<Integer,String>  map = new HashMap<Integer,String>();
           
           map.put(2001,"JOHN");
           map.put(1001, "MICHAEL");
           map.put(4001, "BOB");
           map.put(3001, "DAVID");
          // System.out.println(map);
           
          boolean flag = map.containsKey(12001);
          if( flag == true)
          {
        	  String str = map.get(12001);
        	  System.out.println(str);
          }
          else
          {
        	  System.out.println(" NOT FOUND ");
          }
          Set<Integer> set = map.keySet();
          //System.out.println(set);
          for(int roll :  set )
          {
        	  String name = map.get(roll);
        	  System.out.println(roll+"  "+name);
          }

	}

}
