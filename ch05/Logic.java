public class Logic
{
    public static void main(String[] args)
    {
        boolean yes = true;
        boolean no = false;

        System.out.println("Both YesYes True: " + (yes && yes));
        System.out.println("Both YesNo True: " + (yes && no));
        System.out.println("Either YesYes True: " + (yes || yes));
        System.out.println("Either YesNo True: " + (yes || no));
        System.out.println("Eitehr NoNo True: " + (no || no));
        System.out.println("Original Yes Value: " + yes);
        System.out.println("Original No Value" + no);
    }
}
