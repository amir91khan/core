package exception;
import exception.*;
 interface Bank
{
	public void deposite(double amt)
	throws InvalidAmountException;
	public double withdraw(double amt)
	throws InvalidAmountException,InsufficientFundsException;
	public void balanceEnquiry();
	}


