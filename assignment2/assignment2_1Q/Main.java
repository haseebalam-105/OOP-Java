import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		double length;
		double width;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length of the rectangular");
		length = input.nextDouble();
		System.out.println("Enter the width of the rectangular");
		width = input.nextDouble();
		
		Rectangular r1 = new Rectangular(length,width);
		
		System.out.println("Length : " + r1.getLength());
		System.out.println("Width : " + r1.getWidth());
		System.out.println("Area : " + r1.calculateArea());
		System.out.println("Perimeter : " + r1.calculatePerimeter());
		
	}
}
