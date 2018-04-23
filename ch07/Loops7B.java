public class Loops7B
{
    public static void main(String[] args)
    {
        System.out.println("For loop:");
        forLoopUp();
        System.out.println("While loop:");
        whileLoopUp();
        System.out.println("Do while loop:");
        doWhileLoopUp();
    }

    private static void forLoopUp()
    {
        for(int i = 0;i < 101; i += 10)
            System.out.println(i);
    }

    private static void whileLoopUp()
    {
        int i = 0;

        while(i < 101)
        {
            System.out.println(i);
            i +=10;
        }
    }

    private static void doWhileLoopUp()
    {
        int i = 0;
        do
        {
            System.out.println(i);
            i += 10;
        }while(i < 101);
    }
}
