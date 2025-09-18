public class Rectangular
{
	double length;
	double width;
	
	public Rectangular(double length,double width)
	{
		setLength(length);
		setWidth(width);
	}
	
	public void setLength(double length)
	{
		this.length = length;
	}
	
	public void setWidth(double width)
	{
		this.width = width;
	}
	public double getLength()
	{
			return length;
	}
	public double getWidth()
	{
			return width;
	}
	
	
	public double calculateArea()
	{
		double area = length*width;
		return area;
	}
	
	public double calculatePerimeter()
	{
		double perimeter = 2*(length+width);
		return perimeter;
	}
}