import java.util.Scanner;

public class Circle
{
	
	public static void main(String[] args)
	{
		double radius;
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle ");
		radius = input.nextDouble();
		
		Calculation c1 = new Calculation(radius);
		
		System.out.printf("Radius: %.2f %n%n" ,c1.getRadius());
		c1.calculateArea();
		c1.calculatePerimeter();
	}
}


