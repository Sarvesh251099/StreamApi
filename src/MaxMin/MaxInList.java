package MaxMin;

import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors.*;
public class MaxInList {
	public static void main(String [] args) {
		
//		FInd max of list
		List<Integer> list = List.of(1,3,5,2,4,7,8,9,10,50,48);
		
		int max =  list.stream()
		.min(Integer::compareTo)
		.orElse(0);
		
		System.out.println(max);
	}

}
