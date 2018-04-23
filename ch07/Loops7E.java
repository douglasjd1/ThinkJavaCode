import java.util.Scanner;
public class Loops7E
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int input;
        System.out.println("Enter a number: ");
        do
        {
            input = in.nextInt();
        }while(input != 0);
    }
}
