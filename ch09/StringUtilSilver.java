public class StringUtilSilver
{
    public static void main(String[] args)
    {
        printPhoneNumber("1231231234");

    }

    private static void printPhoneNumber(String x)
    {
        int[] phoneNumber = new int[12];
        if(x.length()==12)
        {
            for(int i=0;i<x.length();i++)
            {
                if(i>=0&&i<=3||i>=4&&i<=7||i>=8&&i<=12)
                {
                    if ((x.substring(i, i + 1)).equals("1"))
                    {
                        phoneNumber[i] = 1;
                    }

                    if ((x.substring(i, i + 1)).equals("a") || (x.substring(i, i + 1)).equals("b") || (x.substring(i, i + 1)).equals("c") || (x.substring(i, i + 1)).equals("2"))
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

                    if ((x.substring(i, i + 1)).equals("a") || (x.substring(i, i + 1)).equals("b") || (x.substring(i, i + 1)).equals("c") || (x.substring(i, i + 1)).equals("2"))
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
