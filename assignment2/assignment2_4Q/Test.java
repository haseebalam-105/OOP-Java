import java.util.Scanner;
public class Test
{
	public static void main(String[] args)
	{
		String color;
		int height;
		int width;
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the color of the rectangular ");
		color = input.nextLine();
		
		System.out.println("Enter the height of the rectangular ");
		height = input.nextInt();
		
		System.out.println("Enter the width of the rectangular ");
		width = input.nextInt();
		
		Rectangular r1 = new Rectangular(color,height,width);
		
		System.out.printf("Color : %s %n" , r1.getColor());
		System.out.printf("Area : %d %n",r1.calculateArea());
		System.out.printf("Perimeter : %d %n",r1.calculatePerimeter());
		
	}
}