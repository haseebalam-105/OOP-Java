public enum InternetPlanType
{
    BASIC(100,500,0),MEDIUM(200,700,0),ADVANCE(300,1000,0),PREMIUN(400,1300,0.12),UNLIMITED(500,1500,0.25);

    private final double price;
    private final double dataLimit;
    private final double discount;

    InternetPlanType(double price, double dataLimit , double discount)
    {
        this.price = price;
        this.dataLimit = dataLimit;
        this.discount = discount;
    }

    public double getPrice()
    {
        return price - (price * discount);
    }

    public double getDataLimit() {
        return dataLimit;
    }
}
