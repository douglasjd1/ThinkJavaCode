public class Comparison
{
    public static void main(String[] args)
    {
        String txt = "Fantastic ";
        String lang = "Java";
        boolean state  = (txt==lang);

        System.out.println("String Equality Test: " + state);

        state = (txt!=lang);
        System.out.println("String Inequality Test: " + state);

        int dozen = 12;
        int score = 20;
        state = (dozen>score);

        System.out.println("Greater Than Test: " + state);

        state = (dozen < score);

        System.out.println("Less Than Test: " + state);
    }
}
