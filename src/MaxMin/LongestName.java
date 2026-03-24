package MaxMin;

import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors.*;

class Emp {
    String name;
    String department;
    double salary;

    public Emp(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    
    public String getName() {
    	return name;
    }
    
    
}

public class LongestName {

	public static void main(String [] args) {
		List<Emp> employees = Arrays.asList(
			    new Emp("Alice",       "IT",      75000),
			    new Emp("Bob",         "HR",      60000),
			    new Emp("Christopher", "IT",      85000),
			    new Emp("Dave",        "Finance", 70000),
			    new Emp("Bob",   "HR",      90000)
			);
		
		String res =employees.stream()
				.map(n-> n.getName())
		.max(Comparator.comparing(String::length))
		
		.orElse(null);
		
		System.out.println(res);
	}
}
