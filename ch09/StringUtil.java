public class StringUtil
{
    public static void main(String[] args)
    {
        String x = "Hello!";
        System.out.println("getFirstCharacter: " + getFirstCharacter(x));
        System.out.println("getLastCharacter: " + getLastCharacter(x));
        System.out.println("getFirstTwoCharacter: " + getFirstTwoCharacter(x));
        System.out.println("getLastTwoCharacter: " + getLastTwoCharacter(x));
        System.out.println("getAllButFirstThreeCharacters: " + getAllButFirstThreeCharacters(x));
        printCharacters(x);
        printPhoneNumber("501-555-0100");
        System.out.println("Index of first e: " + findFirstE(x));
        System.out.println("Is it Finn? " + isFinn("Finn"));
        System.out.println("Is it Finn? " + isFinn("Jake"));
    }

    private static String getFirstCharacter(String x)
    {
        x = x.substring(0,1);
        return x;
    }

    private static String getLastCharacter(String x)
    {
        x = x.substring(x.length()-1);
        return x;
    }

    private static String getFirstTwoCharacter(String x)
    {
        x = x.substring(0,2);
        return x;
    }

    private static String getLastTwoCharacter(String x)
    {
        x = x.substring(x.length()-2,x.length());
        return x;
    }

    private static String getAllButFirstThreeCharacters(String x)
    {
        x = x.substring(3);
        return x;
    }

    private static void printCharacters(String x)
    {
        System.out.println("Characters in string by position: ");
        for(int i=0;i<x.length();i++)
        {
            System.out.println(x.substring(i,i+1) + ": " + i);
        }
    }

    private static void printPhoneNumber(String x)
    {
        System.out.println("Phone Number: ");
        System.out.print("Area code: " + x.substring(0,3) + "\t");
        System.out.print("Exchange: " + x.substring(4,7) + "\t");
        System.out.print("Line Number: " + x.substring(8,12));
        System.out.println();
    }

    private static int findFirstE(String x)
    {
        return x.indexOf('e');
    }

    private static boolean isFinn(String x)
    {
        if(x.equals("Finn"))
            return true;
        return false;
    }
}
