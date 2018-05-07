package com.company;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class BingoNumbers
{
    static Set <Integer> bingoNumbers = new HashSet<>();
    static Set <String> bingoNumbersString = new HashSet<>();
    static boolean isValidNumber = false;
    public static void main(String[] args)
    {
        BingoNumbers bingoNumbers = new BingoNumbers();

        bingoNumbers.run();
    }
    private static void run()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play some bingo. Enter one of the following commands: ");
        printCommands();
        String command = "";

        do
        {
            try
            {
                String entered = scanner.nextLine();
                String[] commandLine;
                commandLine = entered.split(" ");

                command = commandLine[0].toUpperCase();

                isValidNumber = false;

                if (commandLine.length > 1 && Integer.parseInt(commandLine[1]) > 0 && Integer.parseInt(commandLine[1]) <= 75)
                {
                    isValidNumber = true;
                }

                if (command.equals("CALL"))
                {
                    if(commandLine.length > 1)
                    {
                        int numberEntered = Integer.parseInt(commandLine[1]);
                        call(numberEntered);
                    }
                    else
                    {
                        Random random = new Random();
                        isValidNumber = true;
                        int bingoNumber = random.nextInt(75) + 1;
                        call(bingoNumber);
                    }
                }



                else if (command.equals("CALLED"))
                {
                    called();
                }

                else if (command.equals("VERIFY"))
                {
                    int numberEntered = Integer.parseInt(commandLine[1]);
                    verify(numberEntered);
                }

                else if (command.equals("TOGO"))
                {
                    toGo(bingoNumbers);
                }

                else if (command.equals("CHALLENGE"))
                {
                    int numberEntered = Integer.parseInt(commandLine[1]);
                    challenge(numberEntered);
                }

                else if (command.equals("BINGO"))
                {
                    bingo();
                }

                else
                {
                    System.out.println("Invalid input. Enter another command.");
                }
            }
            catch(Exception e)
            {
                System.out.println("Invalid input. Enter another command.");
            }

        }while(command != "EXIT");


        System.out.println("Thanks for playing Bingo. Goodbye!");
    }

    private static void printCommands()
    {
        System.out.println("Call <1 - 75>");
        System.out.println("Called");
        System.out.println("Verify <1 - 75>");
        System.out.println("Challenge <1 - 75>");
        System.out.println("ToGo");
        System.out.println("Bingo!");
        System.out.println("Exit");
    }

    private static void call(int bingoNumber)
    {
        if(bingoNumbers.contains(bingoNumber))
        {
            printNumber(bingoNumber);
            System.out.println(" has already been called. Try another one.");
        }
        else if (isValidNumber)
        {
            bingoNumbers.add(bingoNumber);
            bingoNumbersString.add(getBingoLetter(bingoNumber) + String.valueOf(bingoNumber));
            System.out.print("Added ");
            printNumber(bingoNumber);
            System.out.println(" to the list of Bingo numbers");
        }

        else
        {
            System.out.println("I can't add that number. Enter a number between 1 and 75.");
        }
    }

    private static void called()
    {
        if(bingoNumbers.size() > 0)
        {
            System.out.println("List of numbers called so far: ");
            System.out.println(bingoNumbersString);
        }

        else
        {
            System.out.println("No numbers have been called.");
        }
    }

    private static void verify(int bingoNumber)
    {
        if(isValidNumber && bingoNumbers.contains(bingoNumber))
        {
            System.out.println(bingoNumber + "has already bee called.");
        }

        else if(isValidNumber && !bingoNumbers.contains(bingoNumber))
        {
            System.out.println("That number has not been called yet.");
        }
        else if(!isValidNumber)
        {
            System.out.println("I can't verify that number. Enter a number between 1 and 75.");
        }
    }

    private static void challenge(int bingoNumber)
    {
        if(isValidNumber && bingoNumbers.contains(bingoNumber))
        {
            bingoNumbers.remove(bingoNumber);
            System.out.println(bingoNumber + " removed from the list of called numbers.");
        }
        else
        {
            System.out.println("I can't remove that number. Either it hasn't been called yet, or it is an invalid number.");
        }
    }

    private static void toGo(Set <Integer> calledNumbers)
    {
        if(bingoNumbers.size() >= 75)
        {
            System.out.println("All numbers have been called. Surely you got a bingo.");
        }
        else
        {
            Set<Integer> allBingoNumbers = new HashSet<>();
            Set<String> allBingoNumbersString = new HashSet<>();

            for (int i = 1; i <= 75; i++)
            {
                allBingoNumbers.add(i);
            }

            allBingoNumbers.removeAll(calledNumbers);
            for (int x : allBingoNumbers)
            {
                allBingoNumbersString.add(getBingoLetter(x) + x);
            }

            System.out.println("Numbers that have not been called yet: " + allBingoNumbersString);
        }
    }

    private static void bingo()
    {
        if(bingoNumbers.size() >= 4)
        {
            System.out.println("Congratulations! You win a fruit cake.");
            bingoNumbers.clear();
        }
        else
        {
            System.out.println("Cheater! You haven't even called four numbers. You couldn't possibly have won.");
        }
    }

    private static void printNumber(int number)
    {
        if (number > 0 && number <= 15)
            System.out.print("B" + number);
        if (number >= 16 && number <= 30)
            System.out.print("I" + number);
        if (number >= 31 && number <= 45)
            System.out.print("N" + number);
        if (number >= 46 && number <= 60)
            System.out.print("G" + number);
        if (number >= 61 && number <= 75)
            System.out.print("O" + number);
    }

    private static String getBingoLetter(int number)
    {
        if (number > 0 && number <= 15)
            return "B";
        if (number >= 16 && number <= 30)
            return "I";
        if (number >= 31 && number <= 45)
            return "N";
        if (number >= 46 && number <= 60)
            return "G";
        if (number >= 61 && number <= 75)
            return "O";
        else
            return "";
    }
}
