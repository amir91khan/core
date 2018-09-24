package exception;

class InsuffBalException extends Exception {
	InsuffBalException(String msg) {
		super(msg);
	}
}

class Account {
	private int accno;
	private float balance;

	Account(int accno, float balance) {
		this.accno = accno;
		this.balance = balance;
	}

	void withdraw(float tamt) throws InsuffBalException {
		if (balance < tamt)
			throw new InsuffBalException("balance not avl");
		else
			balance = balance - tamt;
	}

	void printAccount() {
		System.out.println(accno);
		System.out.println(balance);
	}
}

public class ExceptionTest54 {

	public static void main(String[] args) {
		try {
			Account acc1 = new Account(101, 50000f);
			acc1.withdraw(20000f);
			acc1.printAccount();

		} catch (InsuffBalException e) {
			System.out.println(e.getMessage());
		}
	}
}
