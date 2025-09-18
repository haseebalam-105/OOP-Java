public class Cylinder extends Circle
{
    private double height;

    public Cylinder(String color, double radius, double height)
    {
        super(color, radius);
        setHeight(height);
    }

    @Override
    public double calculateArea()
    {
        return 2*(Math.PI * getRadius() * getRadius()) + (Math.PI * getRadius() * height);
    }

    @Override
    public void display()
    {
        System.out.printf("Color : %s %n" , getColor());
        System.out.printf("Radius : %.2f %n" , getRadius());
        System.out.printf("Height : %.2f %n" , getHeight());
        System.out.printf("Area : %.2f %n" , calculateArea());

    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        if(height > 0)
        {
            this.height = height;
        }
        else
        {
            System.out.println("Invalid length! ");
        }

    }
}
