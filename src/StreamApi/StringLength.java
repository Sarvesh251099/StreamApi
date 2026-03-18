package StreamApi;

import java.util.*;
import java.util.Comparator;

public class StringLength {

	public static void main(String [] args) {
		
		String str = "I am java Developer";
		
		String res = Arrays.stream(str.split("\\s+"))
				.max(Comparator.comparing(String::length))
				.orElse("");
		System.out.println(res);
		
		
		String out = Arrays.stream(str.split("\\s+"))
				.max(Comparator.comparing(String::length))
				.orElse("");
		
		System.out.println(out);
	}
}
