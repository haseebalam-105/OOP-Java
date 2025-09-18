public class Time implements Ticker
{
    private int seconds;
    private int minutes;
    private int hours;

    public Time(int seconds, int minutes, int hours) {
      setSeconds(seconds);
      setMinutes(minutes);
      setHours(hours);
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void Trick()
    {
        if(seconds == 60) {
            seconds =0;
            minutes++;
        }
        else{
            seconds++;
        }
        if(minutes==60) {
            minutes = 0;
            hours++;
        }

        if(hours== 24)
        {
            hours = 0;
        }
    }

    @Override
    public String toString() {
        return "Time{" +
                "seconds=" + seconds +
                ", minutes=" + minutes +
                ", hours=" + hours +
                '}';
    }
}
