import java.util.Scanner;

public class IntergalacticVendingMachine
{
    public static void main(String[] args)
    {
        String[] food = {"Freeze Dried Sushi", "Spock's Brain Blast", "Alien Asparagus"};
        Scanner in = new Scanner(System.in);
        int[] sales = new int[3];

        int userChoice = -1;
        System.out.println("Menu options: ");
        printMenu(food);
        System.out.println();

        while(userChoice != 99)
        {
            System.out.println("Which would you like?");

            userChoice = in.nextInt();
            for(int i = 0;i<array(userChoice).length;i++)
            {


                if(array(userChoice)[i] == 0 || array(userChoice)[i] == 1 ||array(userChoice)[i] == 2)
                    System.out.println("Thank you for ordering " + food[array(userChoice)[i]]);

                if (array(userChoice)[i] == 0)
                    sales[0]++;
                if (array(userChoice)[i] == 1)
                    sales[1]++;
                if (array(userChoice)[i] == 2)
                    sales[2]++;
                printSales(sales, food);
                if(i<array(userChoice).length-1)
                {
                    if(array(userChoice)[i]==9&&array(userChoice)[i+1]==9)
                        userChoice = 99;
                }
            }
            System.out.println();
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
        System.out.println("Sales so far: ");

        for(int i = 0;i<food.length;i++)
        {
            System.out.println(sales[i] + " of " + food[i]);
        }

    }

    private static int[] array(int input)
    {
        int n = 0;
        int inputb = input;

        while(inputb > 0)
        {
            inputb /= 10;
            n++;
        }
        if(input == 0)
        {
            n = 1;
        }
        int[] selection = new int[n];
        for(int i = 0;i<selection.length;i++)
        {
            selection[i] = input % 10;
            input/=10;
        }

        return selection;
    }
}