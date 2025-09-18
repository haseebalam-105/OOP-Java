class Rectangular extends Shape
{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangular()
    {}

    public Rectangular(double width, double length)
    {
        setWidth(width);
        setLength(length);
    }

    public Rectangular(double width, double length, String color, boolean filled)
    {
        super(color, filled);
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea()
    {
        return getLength()*getWidth();
    }
    public double getPerimeter()
    {
        return 2*(getWidth()+getWidth());
    }

    @Override
    public double computeArea()
    {
        double area = getArea();
        return getArea() ;
    }

    @Override
    public void reset()
    {
        setLength(0);
        setWidth(0);
    }

    @Override
    public String toString()
    {
        return ", Rectangular{" +
                super.toString()+
                "width=" +
                width +
                ", length=" +
                length +
                '}';
    }
}
