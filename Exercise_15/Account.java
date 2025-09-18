import java.util.Scanner;
public class Account
{
	public static void main(String[] args)
	{
		double depositBalance;
		
		Scanner input = new Scanner(System.in);
		
		AccountBalance account1 = new AccountBalance("haseeb" , 5000);
		AccountBalance account2 = new AccountBalance("zohaib" , 7000);
		
		display(account2);
		System.out.printf("%s has balance of $%.2f%n %n",account1.getName(),account1.getBalance());
		
		System.out.println("Enter the deposit amount");
		depositBalance = input.nextDouble();
			
		
		System.out.printf("%s has balance after deposit is $%.2f%n",account1.getName(),account1.depositBalance(depositBalance));
		
	}
	
	public static void display(AccountBalance account2)
	{
		
	}
}