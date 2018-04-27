public class TimeTester
{
    public static void main(String[] args)
    {
        Timer currentTime = new Timer(2,36,false);
        Timer time1 = new Timer(9,45);
        Timer time2 = new Timer(14,30);

        System.out.println(currentTime.getMilitaryTime());
    }
}
