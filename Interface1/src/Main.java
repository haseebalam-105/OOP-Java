public class Main {
    public static void main(String[] args)
    {

        Date date = new Date(6,11,2024);
        Time time = new Time(59,59,23);
        time.Trick();

        System.out.println(date.toString());
        System.out.println(time.toString());

        time.Trick();
        System.out.println(date.toString());
        System.out.println(time.toString());

        date = new Date(12,10,2024);
        time = new Time(55,23,22);


        System.out.println(date.toString());
        System.out.println(time.toString());

        Ticker dateTime;
        dateTime = time;

        dateTime.Trick();
        System.out.println("After ticking : ");
        System.out.println(dateTime.toString());

    }
}