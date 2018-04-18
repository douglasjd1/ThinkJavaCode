public class PrintAmerican
{
    public static void main(String[] args)
    {
        String day = "Wednesday";
        int date = 18;
        String month = "April";
        int year = 2018;

        printAmerican(day, date, month, year);
        System.out.println();
        printEuropean(day, date, month, year);
    }

    public static void printAmerican(String day, int date, String month, int year)
    {
        System.out.println("American date: " + day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year)
    {
        System.out.println("European date: " + day + " " + date + " " + month + " " + year);
    }
}
