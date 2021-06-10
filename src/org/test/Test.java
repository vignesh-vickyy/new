package org.test;

import java.util.LinkedHashMap;
import java.util.Map;


public class Test 
{
public static void main(String[] args) 
{
Map <Integer,String> m=new LinkedHashMap<>();

m.put(10,"Java");
m.put(20,"Selenium");
m.put(30,"Oracle");
m.put(40,"Python");
m.put(50,"SQL");
  
     System.out.println(m);
        int a=m.size();
     System.out.println(a);
        boolean b=m.containsKey(20);
     System.out.println(b);
        boolean c=m.containsValue("java");
     System.out.println(c);
        boolean d=m.isEmpty();
     System.out.println(d);
        String e=m.get(30);
     System.out.println(e);
         m.remove(20);
     System.out.println(m);   
}
}
