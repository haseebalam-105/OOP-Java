public class Square extends Rectangular
{
    private double side = 1;

    Square()
    {}

    Square(double side)
    {
        super(side,side);
        setSide(side);
    }
    Square(double side,String color,boolean filled)
    {
        super(side,side,color,filled);
        setSide(side);
    }

    public void setSide(double side)
    {
        this.side = side;
        super.setLength(side);
        super.setWidth(side);
    }

    public double getSide()
    {
        return side;
    }

    @Override
    public void setLength(double side)
    {
        setSide(side);
    }

    @Override
    public void setWidth(double side)
    {
        setSide(side);
    }

    @Override
    public void reset() {
        setSide(0);
    }

    @Override
    public double computeArea()
    {
        return super.computeArea();
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color='" + getColor() + '\'' +
                ", filled=" + super.isFilled() +
                '}';
    }
}
