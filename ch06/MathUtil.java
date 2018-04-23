import java.util.Scanner;
public class MathUtil
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two integers:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int result = absoluteSum(x,y);

        System.out.println("The sum of the absolute values of those integers is: " + result);

        System.out.println("Now enter three integers: ");
        x = scanner.nextInt();
        y = scanner.nextInt();
        int z = scanner.nextInt();

        result = absoluteSum(x,y,z);

        System.out.println("The sum of the absolute vales of those three integers is: " + result);
    }

    private static int absoluteSum(int x, int y)
    {
        return Math.abs(x) + Math.abs(y);
    }

    private static int absoluteSum(int x, int y, int z)
    {
        return Math.abs(x) + Math.abs(y) + Math.abs(z);
    }
}
