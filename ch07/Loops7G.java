import java.util.Scanner;

public class Loops7G
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int maxInput = input.nextInt();
        System.out.print(0 + "  | ");

        for(int i = 1; i <= maxInput; i++)
        {
            System.out.printf("%5d", i);
        }
        System.out.println();
        System.out.print("- \t");

        for(int i = 1; i <= maxInput; i++)
        {
            System.out.print("-----");
        }

        System.out.println();
        for(int i = 1; i <= maxInput; i++)
        {
            if(i<10)
                System.out.print(i + "  | ");
            else if(i>=10&&i<100)
                System.out.print(i + " | ");
            else
                System.out.print(i + "| ");
            for(int j = 1; j <= maxInput ; j++)
            {
                System.out.printf("%5d", i * j);
            }
            System.out.println();
        }

    }


}
