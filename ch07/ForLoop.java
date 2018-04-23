public class ForLoop
{
    public static void main(String[] args)
    {
        int num = 0;

        for(int i = 0;i < 4;i++)
        {
            System.out.println("Outer loop i = " + i);
            for(int j = 1; j < 4;j++)
            {
                System.out.print("\tInner Loop j = " + j);
                System.out.println("\t\tTotal num = " + (++num));
            }
        }
    }
}
