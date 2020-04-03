package comm.jsp.accountbalance;
import java.util.Scanner;
public class Account
{
      private int id;
	  private String accType;
	  private double balance;
	  public Account(int id, String accType, double balance) 
	{
		super();
		this.id = id;
		this.accType = accType;
		this.balance = balance;
	}
	 public Account()
	 {	}
	public int getId()
	  {
		  return this.id;
	  }
	  public String getAccType()
	  {
		  return this.accType;
	  }
	  public double getBalance()
	  {
		  return this.balance;
	  } 
	  public void setId(int id)
	  {
		  this.id=id;
	  }
	  public void setaccType(String accType)
	  {
		  this.accType=accType;
	  }
	  public void setBalance(double balance)
	  {
		  this.balance=balance;
	  }
	  double newbalance;
	  public boolean withdraw(double amount)
	  {
		  if( balance>=amount)
		  {
			  newbalance = balance-amount;
			  return true;
		  }
		  return false;
	    }
	  public String getDetails()
	  {
System.out.println("AccountID: "+this.id+"\nAccount Type: "+this.accType+"\nBalance: "+this.balance+
		"\nNew Balance: "+this.newbalance);
return null;
	  }
	  public String getDetails1()
	  {
System.out.println("AccountID: "+this.id+"\nAccount Type: "+this.accType+"\nBalance: "+this.balance
		);
return null;
	  }
	}
                                                                                        

























