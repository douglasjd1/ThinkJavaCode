public class Loop7C
{
    public static void main(String[] args)
    {
        System.out.println("For loop:");
        forLoop();
        System.out.println("While loop:");
        whileLoop();
        System.out.println("Do while loop:");
        doWhileLoop();
    }

    private static void forLoop()
    {
        for(int i = 100;i > -101; i -= 8)
            System.out.println(i);
    }

    private static void whileLoop()
    {
        int i = 100;

        while(i > -101)
        {
            System.out.println(i);
            i -= 8;
        }
    }

    private static void doWhileLoop()
    {
        int i = 100;
        do
        {
            System.out.println(i);
            i -= 8;
        }while(i > -101);
    }
}
