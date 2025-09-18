import java.util.Scanner;
public class CylinderTest
{
	public static void main(String[] args)
	{
		double height;
		double radius;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the height of the cylinder: ");
		height = input.nextDouble();
		
		System.out.print("Enter the radius of the cylinder: ");
		radius = input.nextDouble();
		
//Calling the non-parameterized constructor:
		Cylinder c1 = new Cylinder();
		
//Calling the one-parameterized constructor:		
		Cylinder c2 = new Cylinder(height);
		
//Calling the two-parameterized constructor:
		Cylinder c3 = new Cylinder(height,radius);
		
		
		//c1.display();
		//c2.display();
		//c3.display();
		
	}
}