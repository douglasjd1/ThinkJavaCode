public class Withdrawal
{
    public static void main(String[] args)
    {
        int withdrawal = 137;
        int twenty;
        int ten;
        int five;
        int one;

        twenty = withdrawal / 20;
        withdrawal -= twenty * 20;

        ten = withdrawal / 10;
        withdrawal -= ten * 10;

        five = withdrawal / 5;
        withdrawal -= five * 5;

        one = withdrawal / 1;
        withdrawal -= one * 1;

        System.out.printf(("$20 (%d), $10 (%d), $5 (%d), $1 (%d)"), twenty, ten, five, one);
    }

}
