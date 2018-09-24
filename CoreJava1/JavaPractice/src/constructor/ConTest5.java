package constructor;

class Account {
	private int accno;
	private String name;
	private float balance;

	Account(int accno, String name, float balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	void deposite(float tamt) {
		balance = balance + tamt;
	}

	void withdraw(float tamt) {
		if (balance < tamt)
			System.out.println("insuff balance");
		else
			balance = balance - tamt;

	}

	void printAccount() {
		System.out.println(accno);
		System.out.println(name);
		System.out.println(balance);
	}
}

public class ConTest5 {

	public static void main(String[] args) {
		Account acc1 = new Account(101, "aamir", 10000f);
		Account acc2 = new Account(101, "khan", 5000f);
		acc1.printAccount();
		acc2.printAccount();
		acc1.deposite(2000f);
		acc1.withdraw(500f);
		acc2.withdraw(2001f);
		acc1.printAccount();
		acc2.printAccount();

	}

}
