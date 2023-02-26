package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hashmap {

	public static List<String> sortSales(Map<String, Integer> sales) {
		List<String> sortedList = new ArrayList<>(sales.keySet());
		Collections.sort(sortedList, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return sales.get(o2).compareTo(sales.get(o1));
			}
		});
		return sortedList;
	}

	public static void main(String args[]) {
	    Map<String, Integer> sales = new HashMap<String, Integer>();
		sales.put("Mathew", 50);
		sales.put("Lisa", 76);
		sales.put("Courtney", 45);
		sales.put("David", 49);
		sales.put("Paul", 49);
		
		List<String> employees = sortSales(sales);
		
		System.out.println("Employees in the decreasing order of their sales\n=====================================");
		for (String employeeName : employees) {
			System.out.println(employeeName);
		}
	}
}


