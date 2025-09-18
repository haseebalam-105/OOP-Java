class Rectangular extends Shape
{
    private double width;
    private double length;

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

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getParameter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return super.toString() + ", Rectangular{" + "width=" + width + ", length=" + length + '}';
    }
}
