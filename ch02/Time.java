public class Time
{
    public static void main(String[] args)
    {
        int hour = 14;
        int minute = 50;
        int second = 45;

        int secSinceMidnight;
        int secRemaining;

        secSinceMidnight = (60*60*14) + (50*60) + 45;
        System.out.println("Seconds since midnight: " + secSinceMidnight);

        secRemaining = (24*60*60) - secSinceMidnight;
        System.out.println("Seconds until the day ends: " + secRemaining);

        hour = 14;
        minute = 55;
        second = 30;

        int timeTaken = ((55-5) * 60) + (15+30);
        System.out.println("Seconds it took me to complete this exercise: " + timeTaken);
    }
}
