public class Invoice
{
	private String partNumber;
	private String partDescription;
	private int items;
	private double itemPrice;
	
	Invoice(String partNumber,String partDescription,int items,double itemPrice)
	{
		setPartNumber(partNumber);
		setPartDescription(partDescription);
		setItems(items);
		setPrice(itemPrice);
	}
	
	public void setPartNumber(String partNumber)
	{
		this.partNumber = partNumber;
	}
	
	public void setPartDescription(String partDescription)
	{
		this.partDescription = partDescription;
	}
	
	public void setItems(int items)
	{
		if(items<=0)
		{
			this.items = 0;
		}
		else
		{
			this.items = items;
		}
	}
	
	public void setPrice(double itemPrice)
	{
		if(itemPrice<=0)
		{
			this.itemPrice = 0;
		}
		else
		{
			this.itemPrice = itemPrice;
		}
	}
	
	public double TotalBill()
	{
		double bill = items * itemPrice;
		return bill;
	}
	
	public void displayBill()
	{
		System.out.println("Your item Part Number is :  " + partNumber);
		System.out.println("Your item Part Description is :  " + partDescription);
		System.out.println("Your number of items is :  " + items);
		System.out.println("Your price per item is :  " + itemPrice);
		System.out.println("Your total bill is :  " + TotalBill());
	}
	
}