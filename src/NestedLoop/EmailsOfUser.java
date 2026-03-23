package NestedLoop;
import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors.*;


//Entity
class User {
 String name, email;
 int age;
 // constructor, getters
 
 User(String name,String email,int age){
	 this.name = name;
	 this.email = email;
	 this.age =age;
 }
 
 public String getEmail() {
	 return email;
 }
 
 public int getAge() {
	 return age;
 }
}
public class EmailsOfUser {
	public static void main(String[] args) {
	List<User> users = Arrays.asList(
		    new User("Alice", "alice@mail.com", 25),
		    new User("Bob", "bob@mail.com", 16),
		    new User("Alice", "alice@mail.com", 25),
		    new User("Charlie", "charlie@mail.com", 20),
		    new User("Dave", "dave@mail.com", 15)
		);
	
	List<String> res = users.stream()
	.filter(n -> n.getAge()>18)	
	.map(n ->n.getEmail())
	.distinct()
	.collect(Collectors.toList());
	
	System.out.println(res);
	}
}
