import java.util.Scanner;
public class AccountTest
{
	public static void main(String[] args)
	{
		String name;
		double balance;
		int choice;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the user name ");
		name = input.nextLine();
		
		System.out.println("Enter the user balance ");
		balance = input.nextDouble();
		
		BankAccount a1 = new BankAccount(name, balance);
		
		System.out.printf("User name : %s %n" , a1.getName());
		System.out.printf("User balance : %s %n" , a1.getBalance());
		
		System.out.println("Welcome to the Bank online portal ");
		System.out.println(" ");
		
		System.out.println("Choose the option from the followings ");
		System.out.println(" ");
		
		System.out.println("Press 1 for money deposit ");
		System.out.println("Press 2 for withdrawal money ");
		System.out.println("Press 3 for seeing balance");
		System.out.println(" ");
		choice = input.nextInt();
		
		if(choice == 1)
		{
			System.out.println("After deposit balance is " + a1.depositMoney());	
		}
		else if(choice == 2)
		{
			System.out.println("After withdraw balance is " + a1.withdrawMoney());	
		}
		else if(choice == 3)
		{
			System.out.println("Your balance: " + a1.getBalance());	
		}		
	}
}
