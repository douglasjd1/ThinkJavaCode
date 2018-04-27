public class Timer
{
    private int hour;
    private int minute;

    public Timer(int hour, int minute)
    {
        this.hour = hour;
        this.minute=minute;
    }

    public Timer(int hour, int minute, boolean pm)
    {

        if(pm)
            this.hour=12+hour;
        else
            this.hour=hour;
        this.minute=minute;
    }

    public String getMilitaryTime()
    {
        return "" + hour + ":" + minute;
    }

    public String getTime()
    {
        if(hour<13)
            return "" + hour + ":" + minute + " AM";
        else
            return "" + (Math.abs(12-hour)) + ":" + minute + " PM";
    }
}
