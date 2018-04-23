public class IsDivisible
{
    public static void main(String[] args)
    {
        int x = 34;
        int y = 5;

        int a = 11;
        int b = 1;
        int c = 12;

        System.out.println(isDivisible(x,y));
        System.out.println(isTriangle(a, b, c));
    }

    private static boolean isDivisible(int n, int m)
    {
        boolean result = false;

        if(n % m == 0)
        {
            result = true;
        }
        return result;
    }

    private static boolean isTriangle(int a, int b, int c)
    {
        boolean result = true;

        if(a > b + c || b > a + c || c > a + b)
        {
            result = false;
        }

        return result;
    }
}
