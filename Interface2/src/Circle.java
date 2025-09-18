class Circle extends Shape
{
    private double radius = 1;

    public Circle()
    {}

    public Circle(double radius)
    {
        setRadius(radius);
    }

    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public double getParameter()
    {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Circle{" +
                "radius=" +
                radius +
                '}';
    }
}

