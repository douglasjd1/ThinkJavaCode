public class Loops7A
{
    public static void main(String[] args)
    {
        System.out.println("For Loop Up:");
        forLoopUp();
        System.out.println("For Loop Down:");
        forLoopDown();
        System.out.println("While Loop Up:");
        whileLoopUp();
        System.out.println("While Loop Down:");
        whileLoopDown();
        System.out.println("Do While UP:");
        doWhileLoopUp();
        System.out.println("Do While Down:");
        doWhileLoopDown();
    }

    private static void forLoopUp()
    {
        for(int i = 1;i < 11; i++)
            System.out.println(i);
    }

    private static void forLoopDown()
    {
        for(int i = 10; i > 0; i--)
        {
            System.out.println(i);
        }
    }

    private static void whileLoopUp()
    {
        int i = 1;

        while(i < 11)
        {
            System.out.println(i);
            i++;
        }
    }

    private static void whileLoopDown()
    {
        int i = 10;
        while(i > 0)
        {
            System.out.println(i);
            i--;
        }
    }

    private static void doWhileLoopUp()
    {
        int i = 1;
        do
        {
            System.out.println(i);
            i++;
        }while(i < 11);
    }

    private static void doWhileLoopDown()
    {
        int i = 10;
        do
        {
            System.out.println(i);
            i--;
        }while(i > 0);
    }
}
