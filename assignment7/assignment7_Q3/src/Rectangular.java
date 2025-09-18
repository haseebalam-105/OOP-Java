public class Rectangular extends Shape
{
    private double width;
    private double length;

    public Rectangular(String color , double width , double length)
    {
        super(color);
        setWidth(width);
        setLength(length);
    }

    @Override
    public double calculateArea()
    {
        return width * length;
    }

    @Override
    public double calculatePerimeter()
    {
        return 2*(width + length);
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        if(width>0)
        {
            this.width = width;
        }
        else
        {
            System.out.println("Invalid width! ");
        }
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        if(length>0)
        {
            this.length = length;
        }
        else
        {
            System.out.println("Invalid length !");
        }
    }

    public void dsiplayRectangle()
    {
        System.out.printf("Color of Rectangle : %s %n" , getColor());
        System.out.printf("Length of Rectangle : %.2f %n" , length);
        System.out.printf("Width of Rectangle : %.2f %n" , width);
        System.out.printf("Area of Rectangle : %.2f %n" , calculateArea());
        System.out.printf("Perimeter of Rectangle : %.2f %n" , calculatePerimeter());
    }
}
