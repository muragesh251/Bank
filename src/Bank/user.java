package Bank;

public class user {
	
	
	public static void main(String[] args) {
		
	 Account muragesh = new Account();
	 muragesh.deposite(2000);
	 
	 Account jayapal = new Account();
	 jayapal.deposite(3000);
	 jayapal.withdraw(350);
	 
	 Account ganesh = new Account();
	 ganesh.deposite(4000);
	
	 System.out.println("jayapal Account Balace of ");
	 System.out.println(jayapal.getbalance());
	 
	}

}
