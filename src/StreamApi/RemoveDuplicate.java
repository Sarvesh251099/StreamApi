package StreamApi;

import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String s = "dcdcffkahrinf";
		
		String res = s.chars()
					.distinct()
					.mapToObj(c-> String.valueOf((char) c))
					.collect(Collectors.joining());
		
		System.out.println(res);
	}
}
