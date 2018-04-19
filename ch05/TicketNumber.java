import java.util.Scanner;
public class TicketNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your ticket number: ");
        int ticketNumber = input.nextInt();

        int lastDigit = ticketNumber % 10;
        //System.out.println(lastDigit);

        int ticketPrefix = ticketNumber / 10;
        //System.out.println(ticketPrefix);

        int ticketPrefixRemainder = ticketPrefix % 7;
        //System.out.println(ticketPrefixRemainder);

        boolean result = lastDigit == ticketPrefixRemainder;

        if(result)
            System.out.println("Good number");
        else
            System.out.println("Bad number");
    }
}
