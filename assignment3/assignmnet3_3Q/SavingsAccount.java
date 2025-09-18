public class SavingsAccount
{
	private static  double annualInterestRate;
	private  double balance;
	
	public SavingsAccount(double balance)
	{
		this.balance = balance;
	}
	
	public double MonthlyInterestRate()
	{
		double monthlyInterest = (balance * (annualInterestRate/100))/12;
		return monthlyInterest;  
	}
	
	public static void annualInterestRate(double rate)
	{
		annualInterestRate = rate/100;
	}
	
	public void display()
	{
		balance += MonthlyInterestRate();
		
		System.out.println(" ");
		System.out.printf("Monthly Interest : %.2f %n",MonthlyInterestRate());
		System.out.printf("Balance after Interest Rate : %.2f%n",balance);
		System.out.println(" ");
	}
}