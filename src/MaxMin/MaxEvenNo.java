package MaxMin;

import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors.*;

public class MaxEvenNo {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(15, 22, 33, 44, 7, 56, 11, 38, 91);
		
	int res =	numbers.stream()
		.filter(n -> n%2==0)
		.max(Integer::compareTo)
		.orElse(null);
	
	System.out.println(res);
	}
}
