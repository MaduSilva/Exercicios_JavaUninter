package banking;

public class Account {
	int number;
	String owner;
	double balance;
	double limit;
	
	public Account(int number, String owner, double balance, double limit) {
		super();
		this.number = number;
		this.owner = owner;
		this.balance = balance;
		this.limit = limit;
	}

	boolean withdraw(double value) {
		if(value > limit || value > balance || value <=0) {
			return false;
		}
		
		balance -= value;
		return true;
	}
	
	boolean deposit(double value) {
		if(value <= 0) {
			return false;
	}	
		balance += value;
		return true;
		
	}
	
	void info() {
		System.out.println("Nome " + owner);
		System.out.println("Numero " + number);
		System.out.println("Saldo " + balance);
		System.out.println("Limite " + limit);
	}
}
