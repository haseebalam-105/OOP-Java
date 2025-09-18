public class Account
{
	private int accountId;
	private String name;
	private double withdraw;
	double currentBalance = 5000;
	double balance;
	
	public Account(int accountId , String name , double withdraw)
	{
		setId(accountId);
		setName(name);
		setBalance(withdraw);
	}
	
	public void setId(int accountId)
	{
		this.accountId = accountId;
	}
	public void setName(String name)
	{
		if (name == null || name.isEmpty())
		{
			System.out.println("Invalid input! Error ...");
			return;
		}
		else
		{
			this.name = name;
		}
	}
	public void setBalance(double withdraw)
	{
		
		this.withdraw = withdraw;
	}
	
	public void display()
	{
		if(withdraw > currentBalance || withdraw <0)
		{
			System.out.println("Insufficient Balance! ");
			System.exit(0);
		}
		else
		{
			balance = currentBalance-withdraw;
			System.out.println("Your account id is " + accountId);
			System.out.println("Your account name is " + name);
			System.out.println("Your remaining balance is " + balance);
			System.out.println("Thanks for your corporation ");
		}

	}
	
}