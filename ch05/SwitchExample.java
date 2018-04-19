public class SwitchExample
{
    public static void main(String[] args)
    {
        lastNameWinner("lazenby");
    }

    private static void lastNameWinner(String lName)
    {
        switch(lName)
        {
            case "smith": case "Jones": System.out.println("Congratulations grand winner"); break;
            case "lazenby": System.out.println("Hey, he owes me dinner"); break;
            default: System.out.println("Sorry, not a winner");
        }
    }
}
