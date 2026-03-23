package NestedLoop;

import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors.*;

public class UppercaseUniqueStrings {

	public static void main(String [] args) {
		
	List<String> list = List.of("java","java","Is","fun","loving","language");
	
//	Make String to uppercase if length greater than 3 and is unique
	
	List<String> res=	list.stream()
						.filter(n -> n.length()>3)
						.distinct()
						.map(String::toUpperCase)
						.collect(Collectors.toList());
	
	System.out.println(res);
	}
}
