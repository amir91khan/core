package exception;
import exception. InvalidAmountException;
public class HDFCBank implements Bank
{
	private double balance;
	public void deposite(double amt)throws InvalidAmountException
	{
		if(amt<=0)
		{
			throw new InvalidAmountException(amt+"is invalid amount");
		}
		balance=balance+amt;
	}
	public double withdraw(double amt)
	throws InvalidAmountException,InsufficientFundsException
	{
		if(amt<=0)
		{
			throw new InvalidAmountException(amt+"is invalid amount");
		}
		if(balance<amt)
		{
			throw new InsufficientFundsException("insufficient Funds");
		}
		return balance=balance-amt;
	}
	public void balanceEnquire()
	{
		System.out.println("Current Balance:"+balance);
	}
	@Override
	public void balanceEnquiry() {
		// TODO Auto-generated method stub
		
	}
}
