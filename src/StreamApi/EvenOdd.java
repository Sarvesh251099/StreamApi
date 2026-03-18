package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOdd {
	
	public static void main(String [] args) {
		
		int [] arr = {1,2,3,4,5};
		
		Map<Boolean,List<Integer>> map = Arrays.stream(arr)
				.boxed()
				.collect(Collectors.partitioningBy(n -> n%2 ==0));
		
		List<Integer> even = map.get(true);
		List<Integer> odd = map.get(false);
		
		System.out.println(even);
		System.out.println(odd);


	}

}
