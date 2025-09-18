public class Main {
    public static void main(String[] args)
    {
        Driveable[] d = new Driveable[3];
       d[0]= new Car("Japan","ISB-123",2005);
       d[1]= new MotorBike("China","LHR-123",2024);
       d[2] = new ElectricCar("Pta Ni","SKP-123",2000);

       Vehical a = new Car("Japan","ISB-123",2005);
       a.print();

       Vehical b = new ElectricCar("Pta Ni","SKP-123",2000);
       b.print();

       for (Driveable dd : d)
       {

           dd.startEngine();
           dd.stopEngine();
           dd.drive();
           if(dd instanceof ElectricCar)
           {
               Electric e = (Electric) dd;
               e.batteryCharge();
               e.batteryStatus();
           }
       }


    }
}