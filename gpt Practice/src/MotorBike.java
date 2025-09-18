public class MotorBike extends Vehical
{
    public MotorBike(String make, String model, int year)
    {
        super(make, model, year);
    }

    @Override
    public void startEngine() {
        System.out.println("MotorBike Engine Starts");;
    }

    @Override
    public void stopEngine() {
        System.out.println("MotorBike Engine Stopped");;
    }

    @Override
    public void drive() {
        System.out.println("MotorBike has been driving");;
    }
}
