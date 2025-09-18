abstract class Shape
{
    String color;
    boolean filled;

    Shape()
    {}

    Shape(String color, boolean filled)
    {
        setColor(color);
        setFilled(filled);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getParameter();

    @Override
    public String toString() {
        return "Shape{" + "color='" + color + '\'' + ", filled=" + filled + '}';
    }
}