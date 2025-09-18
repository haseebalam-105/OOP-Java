public class Circle
{
    private String color;
    private double radius;

    public Circle(String color, double radius)
    {
        setColor(color);
        setRadius(radius);
    }

    public double calculateArea()
    {
        return Math.PI * radius * radius ;
    }

    public void display()
    {
        System.out.println("Information of Circle ");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius)
    {
        if(radius >0 )
        {
            this.radius = radius;
        }
        else
            System.out.println("raidus is invalid! ");

    }
}
