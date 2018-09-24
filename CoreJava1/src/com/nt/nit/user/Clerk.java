package com.nt.nit.user;
import java.io.*;
import com.nt.nit.*;
import com.nt.nit.blogic.*;
public class Clerk {

	public static void main(String[] args) {
		try
		{
			Bank acc1=new HDFCBank();
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String option="";
			do {
				try
				{
					System.out.println("Choose one option");
					System.out.println("1. Deposite");
					System.out.println("2. Withdraw");
					System.out.println("3. Balance Enquiry");
					System.out.println("Enter Option:");
					option=br.readLine();
					switch(option) {
					case "1":
					{
						System.out.println("Enter Deposite Amount:");
						String s=br.readLine();
						double amt=Double.parseDouble(s);
						acc1.deposite(amt);
						acc1.balanceEnquiry();
						break;
					}
					case "2":
					{
						System.out.println("Enter Withdraw Amount");
						String s=br.readLine();
						double amt=Double.parseDouble(s);
						double withDrawAmt=acc1.withdraw(amt);
						System.out.println("Withdraw Amount:"+withDrawAmt);
						acc1.balanceEnquiry();
						break;
					}
					case "3":
					{
						acc1.balanceEnquiry();
						break;
					}
					default:
					System.out.println("Invalid Option");
					}
				}
				catch(InvalidAmountException ie) {
					System.out.println(ie.getMessage());
				}
				catch(InsufficientFundsException is) {
					System.out.println(is.getMessage());
				}
				catch(NumberFormatException e) {
					System.out.println("please enter only one number");
				}
				System.out.println("\n Do you want to continue(Yes/No):");
				option=br.readLine();
				if(option.equalsIgnoreCase("No")) {
					System.exit(1);
				}
			}
			while(option.equalsIgnoreCase("Yes"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
