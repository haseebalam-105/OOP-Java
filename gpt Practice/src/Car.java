public class Car extends Vehical
{

    public Car(String make, String model, int year)
    {
        super(make, model, year);
    }

    @Override
    public void startEngine() {
        System.out.println("Car Engine Starts");;
    }

    @Override
    public void stopEngine() {
        System.out.println("Car Engine Stopped");;
    }

    @Override
    public void drive() {
        System.out.println("Car has been driving");;
    }
}
