public class Date implements Ticker
{
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year)
    {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day>30 || day<0)
        {
            System.out.println("Invalid ! ");
        }
        else{
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month>12 || month <0)
        {
            System.out.println("Invalid month");
        }
        else{
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year=year;
    }

    public void Trick()
    {
        if(day== 30)
        {
            day = 1;
            month++;
        }
        else{
            day++;
        }

        if(month == 12)
        {
            month =1;
            year++;
        }
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
