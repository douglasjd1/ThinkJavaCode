public class SimpleMethods
{
    public static void main(String[] args)
    {
        printCount(5);

        printSum(4,6);
        printSum(7,2);

        printBoolean(true);
        printBoolean(false);

    }

    public static void printCount(int count)
    {
        System.out.println("The count is: " + count);
    }

    public static void printSum(int x, int y)
    {
        System.out.println(x + " + " + y + " = " + (x+y));
    }

    public static void printBoolean(boolean isStudent)
    {
        System.out.println("I am a student: " + isStudent);
    }

}

