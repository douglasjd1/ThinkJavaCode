
public class FreeCoffee
{
    public static void main(String[] args)
    {
        System.out.print("Bicycle rider commuting 20 miles: ");
        calculateDiscount(true, false, 20);
        System.out.println();

        System.out.print("Bicycle rider commuting 30 miles: ");
        calculateDiscount(true, false, 30);
        System.out.println();

        System.out.print("Bicycle rider commuting 52 miles: ");
        calculateDiscount(true, false, 52);
        System.out.println();

        System.out.print("Bus rider commuting 35 miles: ");
        calculateDiscount(false, true, 35);
        System.out.println();

        System.out.print("Bus rider commuting 50 miles: ");
        calculateDiscount(false, true, 50);
    }

    private static void calculateDiscount(boolean isBicycle, boolean isBus, int distance)
    {
        float discount = 0;
        String coffee = "";

        if(distance < 21)
        {
            coffee = " and you get free coffee!";
        }

        if(isBicycle && distance < 30)
        {
            discount += .1;
        }

        if(isBus && distance >= 35)
        {
            discount += .2;
        }

        if(isBicycle && distance < 50)
        {
            discount += .2;
        }

        if(isBus && distance < 50)
        {
            discount += .3;
        }

        System.out.println("Your discount is " + discount + "0%" + coffee);
    }
}
