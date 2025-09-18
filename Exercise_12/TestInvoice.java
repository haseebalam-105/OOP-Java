import java.util.Scanner;
public class TestInvoice
{
	public static void main(String[] args)
	{
		String partNumber;
		String partDescription;
		int items;
		double price;
		String choice;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("        ******Welcome to the Hardware Store****** ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Are you willing for shopping? Write yes/Yes for shopping");
		
		if(choice == "yes" || choice == "Yes")
		{
			System.out.println("Enter the part number of the item ");
			partNumber = input.nextLine();
		
			input.nextLine();
			
			System.out.println("Enter the part description of the item ");
			partDescription = input.nextLine();
			
			System.out.println("Enter the number of the items ");
			items = input.nextInt();
			
			System.out.println("Enter the price of one item ");
			price = input.nextDouble();
			
			Invoice r1 = new Invoice(partNumber,partDescription,items,price);
			
			r1.displayBill();
		}
		else 
		{
			System.out.println("Okay no problem Sir...As you wish...");
		}
		
		System.out.println(" Thanks for your arrival in the store ");
	}
}