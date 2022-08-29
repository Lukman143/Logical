package com.sk;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Logical1 {

	public static void main(String[] args) {
		
		List<String> li = new ArrayList<>();
		li.add("Ajay");
		li.add("Raj");
		li.add("Rahul");
		li.add("Arpita");
		li.add("salman");
		li.add("Ram");
		li.add("Arpita");
		li.add("salman");
		li.add("Rahul");
		li.add("Arpita");
		li.add("salman");
		li.add("Arpita");

		Map<Object, List<String>> s = li.stream().collect(Collectors.groupingBy(l -> l));
		List<List<String>> name = s.values().stream().collect(Collectors.toList());
		name.forEach(k -> System.out.println(k.get(0) + "------------" + k.size()));

		/*
		 * for (List<String> names : name) { System.out.println(names +
		 * "--------------------" + names.size()); }
		 */

	}
}
