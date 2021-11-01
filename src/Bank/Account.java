package Bank;

public class Account {
 private double balance;
 
 	public Account() {
	   balance=0.0;
 }
 	public void deposite(double amount) {
 		balance=balance+amount;
 	}
 	public void withdraw(double amount) {
 		if(amount<=balance) {
 			balance=balance-amount;
 		}
 		else {
 			System.err.println("transaction cancelled due to insafisiant balance");
 		}
 	}
 	public double getbalance() {
 		return balance;
 	}
}
