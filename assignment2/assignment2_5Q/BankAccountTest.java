import java.util.Scanner;

public class BankAccountTest 
{	
    public static void main(String[] args)
	{
		int accountNumber;
		String accountTitle;
		double balance;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the account number: ");
        accountNumber = input.nextInt();
        input.nextLine();

        System.out.print("Enter the account title: ");
        accountTitle = input.nextLine();

        System.out.print("Enter the initial balance: ");
        balance = input.nextDouble();
        input.nextLine();

        BankAccount b1 = new BankAccount(accountNumber, accountTitle, balance);

        System.out.println("Account Number: " + b1.getAccountNumber());
        System.out.println("Account Title: " + b1.getAccountTitle());
        System.out.println("Balance: " + b1.getBalance());
    }
}