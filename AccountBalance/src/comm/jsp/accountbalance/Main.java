package comm.jsp.accountbalance;

import java.util.Scanner;

public class Main 
{
  public static void main(String[] args)
  {
	 
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the Account id:");
	int id=scanner.nextInt();
	System.out.println("Enter the Account Type:");
	String acc=scanner.next();
	System.out.println("Enter the balance:");
	double balance= scanner.nextDouble();
	System.out.println("Enter the ammount to be withdrawn:");
	double amount=scanner.nextDouble();
	Account account= new Account(id, acc, balance);
    boolean status = account.withdraw(amount);
    if(status==true)
    {
      account.getDetails();
    }
    else
    {
    	account.getDetails1();
    }
}
}