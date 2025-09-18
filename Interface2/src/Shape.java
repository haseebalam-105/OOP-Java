public class Shape implements Stats
{
    private String color = "Red";
    private boolean filled = true;

    public Shape()
    {}

    public Shape(String color, boolean filled)
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

    @Override
    public String toString() {
        return  "color='" + color + '\'' + ", filled=" + filled ;
    }

    @Override
    public double computeArea() {
        return 0;
    }

    @Override
    public void reset() {
        System.out.println("Reset all to zero");

    }
}
