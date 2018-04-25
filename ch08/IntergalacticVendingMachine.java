import java.util.Scanner;

public class IntergalacticVendingMachine
{
    public static void main(String[] args)
    {
        String[] food = {"Freeze Dried Sushi", "Spock's Brain Blast", "Alien Asparagus"};
        Scanner in = new Scanner(System.in);
        int[] sales = new int[3];

        String userChoice = "";
        System.out.println("Menu options: ");
        printMenu(food);
        System.out.println();
        boolean is99 = false;

        while(!is99)
        {
            System.out.println("Which would you like?");

            userChoice = in.nextLine();

                for (int i = 0; i < array(userChoice).length; i++)
                {
                    if (array(userChoice)[i] == '0' || array(userChoice)[i] == '1' || array(userChoice)[i] == '2')

                    if (array(userChoice)[i] == '0')
                    {
                        sales[0]++;
                        System.out.println("Thank you for ordering " + food[0]);
                    }
                    if (array(userChoice)[i] == '1')
                    {
                        sales[1]++;
                        System.out.println("Thank you for ordering " + food[1]);
                    }
                    if (array(userChoice)[i] == '2')
                    {
                        System.out.println("Thank you for ordering " + food[2]);
                        sales[2]++;
                    }

                    if (i < array(userChoice).length - 1)
                    {
                        if (array(userChoice)[i] == '9' && array(userChoice)[i + 1] == '9')
                        {
                            is99=true;
                        }
                    }
                }
            printSales(sales, food);
        }
        System.out.println("Total sales: ");
        for(int i = 0;i<sales.length;i++)
        {
            System.out.println(sales[i] + " of " + food[i]);
        }
        System.out.println("Goodbye!");
    }

    private static void printMenu(String[] food)
    {
        for(int i = 0; i< food.length;i++)
        {
            System.out.println("Option " + i + ": " + food[i]);
        }
    }

    private static void printSales(int[] sales, String food[])
    {
        System.out.println("Sales so far: \n");

        for(int i = 0;i<food.length;i++)
        {
            System.out.println(sales[i] + " " + food[i]);
        }

    }

    private static char[] array(String input)
    {
        char[] chars = input.toCharArray();
            return chars;

    }
}