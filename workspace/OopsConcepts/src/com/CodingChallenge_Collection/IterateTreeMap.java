package com.CodingChallenge_Collection;

import java.util.Map.Entry;
import java.util.TreeMap;

public class IterateTreeMap {

	public static void main(String[] args) {
		// Create New tree map
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		// Insert Values From tree map
		treeMap.put("java", 25);
		treeMap.put("android", 56);
		treeMap.put("sql", 47);
		treeMap.put("php", 86);
		treeMap.put("python", 12);
		
		// Iterate Over the treeValues using entrySet()
		System.out.println("Iterate Over TreeMap using EntrySet");
		for(Entry<String, Integer> entry : treeMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
		
		// Iterate Over the treeValues using keySet()
		System.out.println("\nIterate Over TreeMap using keySet()");
		for(String key : treeMap.keySet()) {
			System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
		}
		
		// Iterate Over the treeValues using valueSet()
		System.out.println("\nIterate Over TreeMap using valueSet()");
		for(Integer value : treeMap.values()) {
			System.out.println("Value: " + value);
		}
	}

}
