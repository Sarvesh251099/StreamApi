package MaxMin;

import java.util.*;
import java.util.stream.*;
import java.util.stream.Collector.*;


class Employees {
    String name;
    int age;
    String department;

    public Employees(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }


    public int getAge() {
    	return age;
    }
    
    public String getName() {
    	return name;
    }
}
public class EmpIwthLowAge {

	public static void main(String[] args) {
		List<Employees> employees = Arrays.asList(
			    new Employees("Alice",   30, "IT"),
			    new Employees("Bob",     22, "HR"),
			    new Employees("Charlie", 28, "IT"),
			    new Employees("Dave",    35, "Finance"),
			    new Employees("Eve",     22, "HR")
			);
		
		Employees emp =employees.stream()
		.min(Comparator.comparing(Employees::getAge))
		.orElse(null);
		
		System.out.println(emp.getName());
	}
}
