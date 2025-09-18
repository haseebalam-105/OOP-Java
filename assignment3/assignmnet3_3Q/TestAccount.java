public class TestAccount
{
	public static void main(String[] args)
	{
		
		SavingsAccount s1 = new SavingsAccount(2000);
		SavingsAccount s2 = new SavingsAccount(3000);
		
//Set the interest rate to 3 by calling static method by using class without objects
		SavingsAccount.annualInterestRate(3);
		
		System.out.println("For the interest rate of 3 percent");
		s1.display();
		s2.display();

//Set the interest rate to 4 by calling static method by using class without objects		
		SavingsAccount.annualInterestRate(4);
		
		System.out.println(" ");
		System.out.println("After the modification of interest rate of 4");
		s1.display();
		s2.display();
		
		
		
//Set the interest rate to 3 by calling static method by using class without objects
		SavingsAccount.annualInterestRate(3);
		
		System.out.println("For the interest rate of 3 percent");
		s1.display();
		s2.display();

//Set the interest rate to 4 by calling static method by using class without objects		
		SavingsAccount.annualInterestRate(4);
		
		System.out.println(" ");
		System.out.println("After the modification of interest rate of 4");
		s1.display();
		s2.display();
		
	}
}