import java.util.Scanner;
public class TimeConversion
{
    public static void main(String[] args)
    {
        int secInput;
        int hr;
        int min;
        int secConverted;
        final int SEC_PER_MIN = 60;
        final int SEC_PER_HR = SEC_PER_MIN * 60;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number of seconds:");
        secInput = input.nextInt();

        secConverted = secInput;

        hr = secInput/SEC_PER_HR;
        secConverted = secInput%SEC_PER_HR;

        min = secConverted/SEC_PER_MIN;
        secConverted = secConverted%SEC_PER_MIN;

        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds", secInput, hr, min, secConverted);

    }
}
