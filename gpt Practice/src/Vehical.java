public abstract class Vehical implements Driveable
{
    private String make;
    private String model;
    private int year;

    public Vehical(String make, String model, int year)
    {
       setMake(make);
       setModel(model);
       setYear(year);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void startEngine()
    {
        System.out.println("Engine started ");
    }
    @Override
    public void stopEngine()
    {
        System.out.println("Engine Stoped");
    }
    @Override
    public void drive()
    {
        System.out.println("Driving");
    }


    public void print()
    {
        System.out.println("Make in "+ getMake() + "of model "+ getModel()+ "in the "+ getYear());
    }

}
