import java.util.Arrays;

public class StringUtilSilver
{
    public static void main(String[] args)
    {
        printPhoneNumber("565-786-5677");
        System.out.println("Reverse Hello: " + reverse("Hello"));
        System.out.println("Is Palindrome: " + isPalindrome(""));
        System.out.println("Starts with learn: " + allLetters("dog"));
        String[] names = {"t"};
        System.out.println("All letters no dupes: " + allLettersNoDupes(names));
    }

    private static boolean allLettersNoDupes(String[] x)
    {
        if(x.length==0)
            return false;
        if(x.length==1&&x[0].substring(0, 1).equals("l")||x[0].substring(0, 1).equals("e")||x[0].substring(0, 1).equals("a")||x[0].substring(0, 1).equals("r")||x[0].substring(0, 1).equals("n"))
            return true;

        int count=0;
        for(int i=0;i<x.length;i++)
        {
            if (x[i].substring(0, 1).equals("l"))
                count++;
            if (x[i].substring(0, 1).equals("e"))
                count++;
            if (x[i].substring(0, 1).equals("a"))
                count++;
            if (x[i].substring(0, 1).equals("r"))
                count++;
            if (x[i].substring(0, 1).equals("n"))
                count++;
        }

        if(count==1)
            return true;
        return false;
    }
    private static boolean allLetters(String x)
    {
        for(int i=0;i<x.length();i++)
        {
            if(x.substring(0,1).equals("l"))
                return true;
            if(x.substring(0,1).equals("e"))
                return true;
            if(x.substring(0,1).equals("a"))
                return true;
            if(x.substring(0,1).equals("r"))
                return true;
            if(x.substring(0,1).equals("n"))
                return true;
        }
        return false;
    }
    private static boolean isPalindrome(String x)
    {
        for(int i=0;i<x.length();i++)
        {
            String first = x.substring(i,i+1);
            String last = x.substring(x.length()-(i+1),x.length()-i);
            if(!first.equals(last))
                return false;
        }
        return true;
    }


    private static String reverse(String x)
    {
        char[] charArray = x.toCharArray();
        char[] charArrayConverted = new char[x.length()];
        int stringLength = x.length();

        for(int i=0;i<x.length();i++)
        {
            charArrayConverted[i] = charArray[stringLength-1];
            stringLength--;

        }
        String result = new String(charArrayConverted);
        return result;
    }

    private static void printPhoneNumber(String x)
    {
        int[] phoneNumber = new int[12];
        if(x.length()==12)
        {
            for(int i=0;i<x.length();i++)
            {
                if ((x.substring(i, i + 1)).equals("1"))
                {
                    phoneNumber[i] = 1;
                }
                else if ((x.substring(i, i + 1)).equals("a") || (x.substring(i, i + 1)).equals("b") || (x.substring(i, i + 1)).equals("c") || (x.substring(i, i + 1)).equals("2"))
                {
                    phoneNumber[i] = 2;
                }
                else if ((x.substring(i, i + 1)).equals("d") || (x.substring(i, i + 1)).equals("e") || (x.substring(i, i + 1)).equals("f") || (x.substring(i, i + 1)).equals("3"))
                {
                    phoneNumber[i] = 3;
                }
                else if ((x.substring(i, i + 1)).equals("h") || (x.substring(i, i + 1)).equals("i") || (x.substring(i, i + 1)).equals("j") || (x.substring(i, i + 1)).equals("4"))
                {
                    phoneNumber[i] = 4;
                }
                else if ((x.substring(i, i + 1)).equals("k") || (x.substring(i, i + 1)).equals("l") || (x.substring(i, i + 1)).equals("m") || (x.substring(i, i + 1)).equals("5"))
                {
                    phoneNumber[i] = 5;
                }
                else if ((x.substring(i, i + 1)).equals("n") || (x.substring(i, i + 1)).equals("o") || (x.substring(i, i + 1)).equals("p") || (x.substring(i, i + 1)).equals("6"))
                {
                    phoneNumber[i] = 6;
                }
                else if ((x.substring(i, i + 1)).equals("q") || (x.substring(i, i + 1)).equals("r") || (x.substring(i, i + 1)).equals("s") || (x.substring(i, i + 1)).equals("7"))
                {
                    phoneNumber[i] = 7;
                }
                else if ((x.substring(i, i + 1)).equals("t") || (x.substring(i, i + 1)).equals("u") || (x.substring(i, i + 1)).equals("v") || (x.substring(i, i + 1)).equals("8"))
                {
                    phoneNumber[i] = 8;
                }
                else if ((x.substring(i, i + 1)).equals("x") || (x.substring(i, i + 1)).equals("y") || (x.substring(i, i + 1)).equals("z") || (x.substring(i, i + 1)).equals("9"))
                {
                    phoneNumber[i] = 9;
                }
                else if ((x.substring(i, i + 1)).equals("+") || (x.substring(i, i + 1)).equals("0"))
                {
                    phoneNumber[i] = 0;
                }
            }

            System.out.println("Phone Number: ");
            System.out.print("Area code: " + phoneNumber[0] + phoneNumber[1] + phoneNumber[2] + "\t");
            System.out.print("Exchange: " + phoneNumber[4] + phoneNumber[5] + phoneNumber[6] + "\t");
            System.out.print("Line Number: " + phoneNumber[8] + phoneNumber[9] + phoneNumber[10] + phoneNumber[11]+ "\t");
            System.out.println();
        }
        if(x.length()==10)
        {
            for(int i=0;i<x.length();i++)
            {
                    if ((x.substring(i, i + 1)).equals("1"))
                    {
                        phoneNumber[i] = 1;
                    }

                    else if ((x.substring(i, i + 1)).equals("a") || (x.substring(i, i + 1)).equals("b") || (x.substring(i, i + 1)).equals("c") || (x.substring(i, i + 1)).equals("2"))
                    {
                        phoneNumber[i] = 2;
                    }
                    else if ((x.substring(i, i + 1)).equals("d") || (x.substring(i, i + 1)).equals("e") || (x.substring(i, i + 1)).equals("f") || (x.substring(i, i + 1)).equals("3"))
                    {
                        phoneNumber[i] = 3;
                    }
                    else if ((x.substring(i, i + 1)).equals("h") || (x.substring(i, i + 1)).equals("i") || (x.substring(i, i + 1)).equals("j") || (x.substring(i, i + 1)).equals("4"))
                    {
                        phoneNumber[i] = 4;
                    }
                    else if ((x.substring(i, i + 1)).equals("k") || (x.substring(i, i + 1)).equals("l") || (x.substring(i, i + 1)).equals("m") || (x.substring(i, i + 1)).equals("5"))
                    {
                        phoneNumber[i] = 5;
                    }
                    else if ((x.substring(i, i + 1)).equals("n") || (x.substring(i, i + 1)).equals("o") || (x.substring(i, i + 1)).equals("p") || (x.substring(i, i + 1)).equals("6"))
                    {
                        phoneNumber[i] = 6;
                    }
                    else if ((x.substring(i, i + 1)).equals("q") || (x.substring(i, i + 1)).equals("r") || (x.substring(i, i + 1)).equals("s") || (x.substring(i, i + 1)).equals("7"))
                    {
                        phoneNumber[i] = 7;
                    }
                    else if ((x.substring(i, i + 1)).equals("t") || (x.substring(i, i + 1)).equals("u") || (x.substring(i, i + 1)).equals("v") || (x.substring(i, i + 1)).equals("8"))
                    {
                        phoneNumber[i] = 8;
                    }
                    else if ((x.substring(i, i + 1)).equals("x") || (x.substring(i, i + 1)).equals("y") || (x.substring(i, i + 1)).equals("z") || (x.substring(i, i + 1)).equals("9"))
                    {
                        phoneNumber[i] = 9;
                    }
                    else if ((x.substring(i, i + 1)).equals("+") || (x.substring(i, i + 1)).equals("0"))
                    {
                        phoneNumber[i] = 0;
                    }
            }

            System.out.println("Phone Number: ");
            System.out.print("Area code: " + phoneNumber[0] + phoneNumber[1] + phoneNumber[2] + "\t");
            System.out.print("Exchange: " + phoneNumber[3] + phoneNumber[4] + phoneNumber[5] + "\t");
            System.out.print("Line Number: " + phoneNumber[6] + phoneNumber[7] + phoneNumber[8] + phoneNumber[9]+ "\t");
            System.out.println();
        }
    }


}
