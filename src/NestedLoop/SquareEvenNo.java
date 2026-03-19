package NestedLoop;

import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors.*;

public class SquareEvenNo {
	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,2,2,3,3,4,4,5,5,6,6);
		
//		Square of unique even no's
		
		List<Integer> even = list.stream()
				.filter(n -> n%2==0)
				.distinct()
				.map(n -> n*n)
				.collect(Collectors.toList());
		
//		List<Integer> res=	even.stream()
//						.map(n->n*n)
//						.collect(Collectors.toList());
		System.out.println(even);
	}
}
