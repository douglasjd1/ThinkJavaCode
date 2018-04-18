public class BigMethodSignature
{
    public static void main(String[] args)
    {
        printSum(1,2,3,4,5,6,7,8,9,10);
        printSum(67,65,45,4,34,3,2,34,67,8);
    }

    public static void printSum(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j)
    {
        int sum = a + b + c + d + e + f + g + h + i + j;

        System.out.print("The sum of " + a + ", " + b + ", " + c + ", "  + d + ", " + e + ", " + f + ", ");
        System.out.println(g + ", " + h + ", " + i + ", and " + j + ", " + " is " + sum);
    }
}
