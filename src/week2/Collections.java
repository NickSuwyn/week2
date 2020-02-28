package week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collections {
	
	public static void main(String[] args) {
		
		List<String> input = Arrays.asList("Sam", "Tom", "Sam", "Sally", "Sam", "Tom");
		
		Map<String, Integer> nameCounts = countAppearances(input);
		
		for (String key : nameCounts.keySet()) {
			System.out.println(key + " : " + nameCounts.get(key));
		}
		
	}
	
	public static Map<String, Integer> countAppearances(List<String> list) {
		Map<String, Integer> results = new HashMap<String, Integer>();
		
		for (String item : list) {
			if (results.containsKey(item)) {
				results.put(item, results.get(item) + 1);
			} else {
				results.put(item, 1);
			}
		}
		
		return results;
	}
	
	public static Set<String> getUniqueValues(List<String> list) {
		Set<String> result = new HashSet<String>();
		
		for (String s : list) {
			result.add(s);
		}
		
		return result;
	}

}
