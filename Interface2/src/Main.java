public class Main {

    public static void printStats(Stats s)
    {
        System.out.println("Area of the " + s.toString());
        System.out.printf("Area : %.2f %s %n" , s.computeArea() , Stats.field);
        s.reset();
        System.out.println();
        System.out.println("After reset values are : " + s.toString());
        System.out.printf("Area after reset : %.2f %s %n" , s.computeArea() , Stats.field);
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args)
    {
        Stats[] stats = new Stats[]{
                new Square(5),
                new Rectangular(5.1,6.2),
                new Country("Pakistan")
        };

        for(Stats s : stats)
        {
            Main.printStats(s);
        }
    }
}