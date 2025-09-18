import java.util.Scanner;
public class BankAccount
{
	private String name;
	private double balance;
	
	Scanner input = new Scanner(System.in);
	public BankAccount(String name,double balance)
	{
		setName(name);
		setBalance(balance);
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public String getName()
	{
		return name;
	}
	public double getBalance()
	{
		return balance;
	}
	
	
	public double depositMoney()
	{
		double deposit;
		System.out.println("Enter the amount you want to deposit");
		deposit = input.nextDouble();
		balance += deposit;
		return balance;
	}
	
	public double withdrawMoney()
	{
		double withdraw;
		System.out.println("Enter the amount you want to withdraw");
		withdraw = input.nextDouble();
		balance -= withdraw;
		return balance;
	}
}
