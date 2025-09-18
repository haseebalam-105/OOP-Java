public class AccountBalance
{
	private String name;
	private double balance;
	
	public AccountBalance(String name,double balance)
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
		if(balance < 0)
		{
			balance=0;
		}
		else
		{
			this.balance = balance;
		}
	}
	public String getName()
	{
		return name;
	}
	public double getBalance()
	{
		return balance;
	}
	
	public double depositBalance(double depositBalance)
	{
		balance += depositBalance;
		return balance;
	}
	
}