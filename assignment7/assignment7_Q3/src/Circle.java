public class Circle extends Shape
{
    private double radius;

    public Circle(String color, double radius)
    {
        super(color);
        setRadius(radius);
    }

    @Override
    public double calculateArea()
    {
        return (Math.PI * radius *radius);
    }

    @Override
    public double calculatePerimeter()
    {
        return 2 * Math.PI * radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        if(radius > 0)
        {
            this.radius = radius;
        }
        else
        {
            System.out.println("Invalid Radius");
        }
    }

    public void dsiplayCircle()
    {
        System.out.printf("Color of Circle : %s %n" , getColor());
        System.out.printf("Radius of Circle : %.2f %n" , radius);
        System.out.printf("Area of Circle : %.2f %n" , calculateArea());
        System.out.printf("Perimeter of Circle : %.2f %n" , calculatePerimeter());
    }
}
