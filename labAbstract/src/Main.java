import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle(3.0, "Red", true);
        shapes[1] = new Rectangular(4.0, 5.0, "Blue", false);
        shapes[2] = new Circle(7.0, "Green", true);
        shapes[3] = new Rectangular(6.0, 2.0, "Yellow", true);

        Scanner input = new Scanner(System.in);

        System.out.println("Select the shape you want to change:");
        System.out.println("1 for Circle and the 2 for Rectangle");

        int choice = input.nextInt();

        if (choice == 1)
        {
            System.out.print("Enter the new radius for all circles: ");
            double newRadius = input.nextDouble();

            for (Shape shape : shapes)
            {
                if (shape instanceof Circle)
                {
                    Circle circle = (Circle) shape;
                    circle.setRadius(newRadius);
                }
            }
        }
        else if (choice == 2)
        {
            System.out.print("Enter the new width for rectangles: ");
            double newWidth = input.nextDouble();
            System.out.print("Enter the new length for rectangles: ");
            double newLength = input.nextDouble();

            for (Shape shape : shapes)
            {
                if (shape instanceof Rectangular)
                {
                    Rectangular rectangle = (Rectangular) shape;

                    rectangle.setWidth(newWidth);
                    rectangle.setLength(newLength);
                }
            }
        }
        else
        {
            System.out.println("Invalid choice!");
        }

        for (Shape shape : shapes)
        {
            System.out.println(shape.toString());
            System.out.printf("Area: %.2f %n" , shape.getArea());
            System.out.printf("Perimeter: %.2f %n" , shape.getParameter());
            System.out.println();
            System.out.println();
        }
    }
}
