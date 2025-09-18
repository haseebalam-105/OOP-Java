public class BankAccount 
{
    private int accountNumber;
    private String accountTitle;
    private double balance;

    public BankAccount(int accountNumber, String accountTitle, double balance) 
	{
        setAccountNumber(accountNumber);
        setAccountTitle(accountTitle);
        setBalance(balance);
    }

    // Getters and Setters
	
    public void setAccountNumber(int accountNumber) 
	{
        this.accountNumber = accountNumber;
    }
	
	public int getAccountNumber() 
	{
        return accountNumber;
    }

   
    public void setAccountTitle(String accountTitle)
	{
        this.accountTitle = accountTitle;
    }
	
	public String getAccountTitle()
	{
        return accountTitle;
    }


    public void setBalance(double balance) 
	{
        if(balance > 0)
		{
			this.balance = balance;
		} 
		else
		{
			System.out.println("Balance must be greater than zero.");
		}
    }
	
	public double getBalance() 
	{
        return balance;
    }
}