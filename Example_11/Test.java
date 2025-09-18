import java.util.Scanner;

public class Test
{
	public static void main(String[] args)
	{
		int accountNumber;
		String name;
		double withdraw;
		double balance;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the account Id ");
		accountNumber = input.nextInt();
		
		input.nextLine();
		
		System.out.println("Enter the account name ");
		name = input.nextLine();
		
		System.out.println("Enter the withdraw money ");
		withdraw = input.nextDouble();
		
		
		Account r1 = new Account(accountNumber,name,withdraw);
		
		r1.display();
		
		
		
	}
} 