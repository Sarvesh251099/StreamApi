package NestedLoop;

import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors.*;

public class FirstLetter {

	public static void main(String [] args) {
		
	List<String> names = List.of(
	   "Alexander","Alexander", "Bob", "Christopher", "Dan", "Elizabeth", "Al"
			);
	
//	Get first character of string length greater than 3
	
	List<Character> res =	names.stream()
		.filter(n -> n.length()>3)
		.distinct()
		.map(c -> c.charAt(0))
		.sorted()
		.collect(Collectors.toList());
	
	System.out.println(res);
	}
}
