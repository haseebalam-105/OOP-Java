import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the color of circle : ");
        String color1 = sc.nextLine();

        System.out.print("Enter the radius of circle : ");
        double radius1 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter the color of Rectangle : ");
        String color2 = sc.nextLine();

        System.out.print("Enter the width of Rectangle : ");
        double width = sc.nextDouble();

        System.out.print("Enter the length of circle : ");
        double length = sc.nextDouble();

        Circle c1 = new Circle(color1 , radius1);
        c1.dsiplayCircle();

        Rectangular r1 = new Rectangular(color2 , width , length);
        r1.dsiplayRectangle();
    }
}