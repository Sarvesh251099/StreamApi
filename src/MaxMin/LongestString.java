package MaxMin;

import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors.*;

public class LongestString {

	public static void main(String [] args) {
		
		List<String> words = Arrays.asList(
				 "Java", "Stream", "API", "Collections", "Lambda", "Collections"
			);
		
	String res=	words.stream()
		.max(Comparator.comparing(String::length))
		.orElse("List is blank");
	
	System.out.println(res);
	}
}
