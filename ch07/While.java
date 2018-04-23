public class While
{
    public static void main(String[] args)
    {
        int num = 100;

        while(num > 0)
        {
            System.out.println("While countdown: " + num);
            num -= 10;
        }
    }
}
