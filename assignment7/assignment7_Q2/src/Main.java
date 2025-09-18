import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the color : ");
        String color = sc.nextLine();

        System.out.print("Enter the radius : ");
        double radius = sc.nextDouble();

        System.out.print("Enter the height : ");
        double height = sc.nextDouble();

        Cylinder cylinder = new Cylinder(color,radius,height);

        cylinder.display();


    }
}