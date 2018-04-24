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

        do
        {
        System.out.println("Which would you like?");

        userChoice = in.nextInt();

        printSales(sales, food, userChoice);

        }while(userChoice != 99);

        System.out.println("Goodbye!");
    }

    private static void printMenu(String[] food)
    {
        for(int i = 0; i< food.length;i++)
        {
            System.out.println("Option " + i + ": " + food[i]);
        }
    }

    private static void printSales(int[] sales, String[] food, int foodBought)
    {
        int totalBought = 0;


        if (foodBought == 0)
            sales[0]++;
        if (foodBought == 1)
            sales[1]++;
        if (foodBought == 2)
            sales[2]++;
        System.out.println("Sold so far: \n");
        for(int i = 0;i<food.length;i++)
        {
            System.out.println(sales[i] + " of " + food[i]);
        }
    }
}
