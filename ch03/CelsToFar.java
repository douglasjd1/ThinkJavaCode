import java.util.Scanner;
public class CelsToFar

{
    public static void main(String[] args)
    {
        double cels;
        double far;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value in degrees Celcius: ");
        cels = input.nextDouble();

        far = cels * (9/5) + 32;

        System.out.printf("%.1f C = %.1f F", cels, far);
    }
}
