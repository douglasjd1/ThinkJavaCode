import java.util.Scanner;

public class Loops7F
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int total = 0;
        int input;
        while(total < 1000)
        {
            System.out.print("Enter a number:");
            input = in.nextInt();
            total += input;
            if(total < 1000)
                System.out.println("The total so far is: " + total);
        }

        System.out.println("The total is: " + total);
    }
}
