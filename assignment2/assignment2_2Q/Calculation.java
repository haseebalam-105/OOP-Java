import java.util.Scanner;

class Calculation
{
	double radius;
	public Calculation(double radius)
	{
		setRadius(radius);
	}

	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	public double getRadius()
	{
		return radius;
	}

	public void calculateArea()
	{
		double area = Math.PI * radius*radius;
		System.out.printf("Area:  %.2f %n%n", area);
	}
	public void calculatePerimeter()
	{
		double perimeter = 2 * Math.PI * radius;
		System.out.printf("Perimeter: %.2f %n%n", perimeter);
	}
}
