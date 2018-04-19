public class LogicMethods
{
    public static void main(String[] args)
    {
        int x = 9;
        int y = 9;

        printIsLarge(x);
        printIsLargeOrSmall(x);
        printLargest(x,y);
        printLargestOdd(x,y);
    }

    private static void printIsLarge(int number)
    {
        if(number>99)
        {
            System.out.println("The number is large");
        }
    }

    private static void printIsLargeOrSmall(int number)
    {
        if(number>99)
        {
            System.out.println("The number is large");
        }

        else if(number<10)
        {
            System.out.println("The number is small");
        }
    }

    private static void printLargest(int number1, int number2)
    {
        if(number1>number2)
        {
            System.out.println("The largest number is: " + number1);
        }

        else if(number2>number1)
        {
            System.out.println("The largest number is: " + number2);
        }

        else if(number1 == number2)
        {
            System.out.println("The numbers are equal");
        }
    }

    private static void printLargestOdd(int number1, int number2)
    {
        if(number1 % 2 == 1 || number2 % 2 == 1)
        {
            if(number1>number2)
            {
                System.out.println("The largest number odd  number is: " + number1);
            }

            else if(number2>number1)
            {
                System.out.println("The largest odd number is: " + number2);
            }
        }

        else if(number1 % 2 == 0 && number2 % 2 == 0)
        {
            System.out.println("Neither number is odd");
        }

        if(number1 % 2 == 1 && number2 % 2 == 1 && number1 == number2)
        {
            int sum = number1 + number2;
            System.out.println("Two odds make an even: " + sum);
        }
    }
}
