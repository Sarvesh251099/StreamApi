package NestedLoop;
import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors.*;

class Transaction {
    String id, status;
    double amount;
    // constructor, getters
    
    public Transaction(String id, String status,double amount) {
    	this.id = id;
    	this.status =status;
    	this.amount = amount;
    }
    
    public String getStatus() {
    	return status;
    }
    
    public String getId() {
    	return id;
    }
}
public class FailedTransactions {

	public static void main(String[] args) {
		List<Transaction> transactions = Arrays.asList(
			    new Transaction("T1", "FAILED", 500),
			    new Transaction("T2", "SUCCESS", 1000),
			    new Transaction("T1", "FAILED", 500),
			    new Transaction("T3", "FAILED", 200),
			    new Transaction("T4", "SUCCESS", 300),
			    new Transaction("T3", "FAILED", 200)
			);
		
		double count =transactions.stream()
		.filter(n->"FAILED".equals(n.getStatus()))
		.map(n->n.getId())
		.distinct()
		.count();
		
		System.out.println(count);
	}
}
