package NestedLoop;

import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors.*;

class Employee {
    String name, department;
    double salary;
    // constructor, getters
    
    Employee(String name, String department,double salary){
    	this.name =  name;
    	this.department = department;
    	this.salary = salary;    	
    }
    
    public String getDepartment() {
    	return department;
    }
    
    public double getSalary() {
    	return salary;
    }
}
public class SalariesOfEmplyoees {
	public static void main(String[] args) {
		
	
	List<Employee> employees = Arrays.asList(
		    new Employee("Alice", "IT", 75000),
		    new Employee("Bob", "HR", 60000),
		    new Employee("Charlie", "IT", 85000),
		    new Employee("Dave", "IT", 65000),
		    new Employee("Eve", "Finance", 70000)
		);
	
	List<Double> res= employees.stream()
	.filter(n->"IT".equals(n.getDepartment()))
	.map(n -> n.getSalary())
	.sorted()
	.collect(Collectors.toList());
	
	System.out.println(res);
	}
	
	
}
