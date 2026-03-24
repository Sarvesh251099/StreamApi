package MaxMin;

import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors.*;


class Employee {
    String name;
    String department;
    double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    // getters, toString
    
    public double getSalary() {
    	return salary;
    }
    public String getname() {
    	return name;
    }
}
public class EmployHighSalary {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee("Alice",   "IT",      75000),
			    new Employee("Bob",     "HR",      90000),
			    new Employee("Charlie", "IT",      85000),
			    new Employee("Dave",    "Finance", 60000),
			    new Employee("Eve",     "HR",      95000)
			);
		
	 Employee val=	employees.stream()
		.max(Comparator.comparing(Employee::getSalary))
		.orElse(null);
	 
	 System.out.println(val.getname());
		
	}
}
