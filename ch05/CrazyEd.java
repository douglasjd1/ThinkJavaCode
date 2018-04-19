import java.util.Scanner;

public class CrazyEd
{
    public static void main(String[] args)
    {
        System.out.print("Welcome to Crazy Ed's Sting Cheese. Would you like your string cheese to have a diameter of ");
        System.out.println(" 1 inch, 2 inches, or 3 inches (enter 1, 2, or 3)?");

        calculateCost();
    }
        private static void calculateCost()

        {
            final int oneInchCost = 2;
            final int twoInchCost = 4;
            final int threeInchCost = 6;
            final int oneInchShip = 2;
            final int twoInchShip = 2;
            final int threeInchShip = 4;
            final int handlingCharge = 5;
            int initialCost = 0;
            int totalShip = 0;
            int totalCost = 0;

            Scanner input = new Scanner(System.in);

            int cheeseSize = input.nextInt();
            input.nextLine();

            if (cheeseSize > 3 || cheeseSize < 1)
            {
                System.out.println("This order is too crazy. Try a value between 1 and 3.");
                calculateCost();
            }

            System.out.print("OK, so you want the diameter of your string cheese to be " + cheeseSize + ".");
            System.out.println(" How many yards would you like to order?");

            int cheeseLength = input.nextInt();
            input.nextLine();

            System.out.println("So, you want " + cheeseLength + " yards of " + cheeseSize + " inch diameter string cheese.");

            if(cheeseSize == 1)
            {

                initialCost = (oneInchCost * cheeseLength);
                totalShip = (oneInchShip * cheeseLength);
            }

            else if(cheeseSize == 2)
            {

                initialCost = (twoInchCost * cheeseLength);
                totalShip = (twoInchShip * cheeseLength);
            }

            else if(cheeseSize == 3)
            {

                initialCost = (threeInchCost * cheeseLength);
                totalShip = (threeInchShip * cheeseLength);
            }

            if(cheeseSize == 1 && cheeseLength > 50)
            {
                totalShip = 0;
            }

            if(cheeseSize == 2 && cheeseLength > 75)
            {
                totalShip = 0;
            }

            if(cheeseSize == 3 && cheeseLength > 25)
            {
                totalShip = 0;
            }

            totalCost = initialCost + totalShip + handlingCharge;

            System.out.println("Cost of cheese: $" + initialCost);
            System.out.println("Cost of shipping: $" + totalShip);
            System.out.println("Handling charge: $" + handlingCharge);
            System.out.println("Total cost: $" + totalCost);
        }
}
