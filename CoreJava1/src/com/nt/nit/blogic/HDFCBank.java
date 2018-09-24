package com.nt.nit.blogic;
import com.nt.nit.*;
import com.nt.nit.InsufficientFundsException;
import com.nt.nit.InvalidAmountException;

public class HDFCBank implements Bank {
	private double balance;

	@Override
	public void deposite(double amt) throws InvalidAmountException {
		if(amt<=0) {
		    throw new InvalidAmountException(amt+"is invalid amount");
	}
		balance=balance+amt;
	}
	@Override
	public double withdraw(double amt) throws InvalidAmountException, InsufficientFundsException {
		if(amt<=0) {
			throw new InvalidAmountException(amt+"is invalid amount");
		}
		if(balance<amt) {
			throw new InsufficientFundsException("Insuffcients Funds");
		}
		balance=balance-amt;
		return amt;
	}

	@Override
	public void balanceEnquiry() {
		System.out.println("Current Balance:"+balance);

	}

}
