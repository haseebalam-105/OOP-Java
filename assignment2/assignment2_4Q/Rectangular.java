public class Rectangular
{
	private String color;
	private int height;
	private int width;
	
//Declare the constructor
	
	public Rectangular(String color,int height,int width)
	{
		setColor(color);
		setHeight(height);
		setWidth(width);
	}
	
//method to Set the color 
	public void setColor(String color)
	{
		this.color = color;
	}
	
//method to get the color
	public String getColor()
	{
		return color;
	}
	
//method to Set the height 
	public void setHeight(int height)
	{
		if(height>0)
		{
			this.height = height;
		}
		else
		{
			System.out.print("Enter the height in positive ");
		}
	}
	
//method to get the height
	public int getHeight()
	{
		return height;
	}
	
//method to Set the width 
	public void setWidth(int width)
	{
		if(width>0)
		{
			this.width = width;
		}
		else
		{
			System.out.print("Enter the height in positive ");
		}
	}
	
//method to get the width
	public int getWidth()
	{
		return width;
	}
	
//method to calculate the area
	public int calculateArea()
	{
		return height*width;
	}
	
//method to calculate the Perimeter
	public int calculatePerimeter()
	{
		return 2*(height+width);
	}
	

	
}