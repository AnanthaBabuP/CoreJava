package com.MethodOverriding;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

public class MapInterfaceDemo {

	public static void main(String[] args) {
		 
		// Map Interface
		// collection of key and value pairs
		
		/* Methods
		 *  public void put(K,V);
		 *  public Object get(Object key);
		 *  public Set<K> keySet();
		 *  public Collection values();
		 *  public Map<Entry<K,V>> entrySet();	
		 */
		
		Map<String, Integer> m1 = new HashMap<String, Integer>(); // Random Order
		
		// put methods
		m1.put("java", 25);
		m1.put("android", 56);
		m1.put("sql", 47);
		m1.put("php", 86);
		m1.put("python", 12);
	
		System.out.println(m1);
		
		// get methods
		System.out.println(m1.get("java"));
		
		// Key set with Iterator
		Iterator<String> itr =m1.keySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		// Value Set with Iterator
		Iterator<Integer> itr2 = m1.values().iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		// Key Set with Set
		Set<String> set = m1.keySet();
		System.out.println(set);
		
		// Entry Set
		// 
		System.out.println("Entry Set Declaration");
		for(Map.Entry<String, Integer> m : m1.entrySet()) {
			System.out.println(m.getKey()+ "\t"+m.getValue());
		}
		
		Map<String, Integer> m2 = new LinkedHashMap(); // Insertion Order
		
		m2.put("java", 25);
		m2.put("android", 56);
		m2.put("sql", 47);
		m2.put("php", 86);
		m2.put("python", 12);
	
		System.out.println(m2);
		
		Map<String, Integer> m3 = new TreeMap<String, Integer>(); // Assigning (or) Natural Order [Comparator Interface]
		
		m3.put("java", 25);
		m3.put("android", 56);
		m3.put("sql", 47);
		m3.put("php", 86);
		m3.put("python", 12);
	
		System.out.println(m3);
		
		
		// Hsh Table
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>(); // Assigning (or) Natural Order [Comparator Interface]
		
		ht.put("java", 25);
		ht.put("android", 56);
		ht.put("sql", 47);
		ht.put("php", 86);
		ht.put("python", 12);
	
		System.out.println(ht);
		
		
	}
}
