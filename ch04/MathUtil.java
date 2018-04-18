public class MathUtil
{
    public static void main(String[] args)
    {
        printDifference(1000,4000000);

    }

    public static void printDifference(int x, int y)
    {
        int difference = x - y;
        System.out.println("The difference of " + x + " and " + y + " is " + difference);
        printAbsValue(difference);
    }

    public static void printAbsValue(int x)
    {
        System.out.println("Value is: " + x + " and abs value is: " + Math.abs(x));
    }

}
