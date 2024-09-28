package com.CodingChallenge_Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HashMapSorting {
    public static void main(String[] args) {
        
    	// Creating a HashMap with some elements
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        hashMap.put("Banana", 3);
        hashMap.put("Apple", 5);
        hashMap.put("Cherry", 2);
        hashMap.put("Date", 10);
        
        System.out.println("Original HashMap: " + hashMap);
        
        // Get the keys from the map and store them in a list
        List<String> sortedKeys = new ArrayList<>(hashMap.keySet());
        
        // Sort the keys using Collections.sort()
        Collections.sort(sortedKeys);
        
        // Create a new TreeMap to Assign HashMap Value
        Map<String, Integer> sortedMap = new TreeMap<>(hashMap);
        
        // Displaying the sorted map
        System.out.println("Sorted HashMap by keys: " + sortedMap);
    }
}
