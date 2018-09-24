package com.nt.nit.blogic;
import com.nt.nit.*;
import com.nt.nit.InsufficientFundsException;
import com.nt.nit.InvalidAmountException;

public interface Bank {
	public void deposite(double amt)throws InvalidAmountException;
	public double withdraw(double amt)throws InvalidAmountException,InsufficientFundsException;
	public void balanceEnquiry();
	
	}


