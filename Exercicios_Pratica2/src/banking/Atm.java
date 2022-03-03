package banking;

public class Atm {

	public static void main(String[] args) {
		Account c1 = new Account(111, "Jay", 2000, 500);
		
		c1.info();
		
		if(!c1.withdraw(200)) {
			System.out.println("Erro na operação de saque");
		}
		if(!c1.deposit(500)) {
			System.out.println("Erro na operação de depósito");
		}
		System.out.println("");
		c1.info();

	}

}
