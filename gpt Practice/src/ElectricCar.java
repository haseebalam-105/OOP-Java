public class ElectricCar extends Car implements Electric
{
    public ElectricCar(String make, String model, int year)
    {
        super(make, model, year);
    }

    public void batteryStatus()
    {
        System.out.println("Battery is full...");
    }

    public void batteryCharge()
    {
        System.out.println("Battery require charging ");
    }
}
