package com.company;

import java.util.Scanner;
import java.util.Stack;

public class EmergencyTracker
{
    Stack<String> emergencyTasks = new Stack<>();
    Scanner scanner = new Scanner(System.in);
    String command = "";
    String emergency = "";

    public static void main(String[] args)
    {
        EmergencyTracker emergencyTracker = new EmergencyTracker();

        emergencyTracker.run();
    }
    void run()
    {
        System.out.println("Welcome to the emergency input system. Enter one of the following commands: ");
        printCommands();

        do
        {
            try
            {
                String commandLine = scanner.nextLine();
                String[] commands = commandLine.split(" ");
                command = commands[0].toUpperCase();

                if(commands.length == 2)
                    emergency = commands[1];
                if(commands.length > 2)
                {
                    System.out.println("Invalid input. Don't enter more than 2 values.");
                }
                else if(command.equals("ADD"))
                {
                    add(emergency);
                }
                else if(command.equals("PEEK"))
                {
                    peek();
                }
                else if(command.equals("REMOVE"))
                {
                    remove();
                }
                else if(command.equals("HOWMANY"))
                {
                    remove();
                }
                else if(command.equals("PANIC"))
                {
                    panic();
                }
                else if(command.equals("EXIT"))
                {
                    System.out.println("Thank you for using this emergency tracking system.");
                }
                else
                {
                    System.out.println("Invalid command.");
                }
            }
            catch (Exception e)
            {
                System.out.println("Invalid input.");
            }

            if(!command.equals("EXIT"))
                System.out.print("Enter another command: \n");

        }while(!command.equals("EXIT"));

        System.out.println("Goodbye.");
    }

    void printCommands()
    {
        System.out.println("Add <EmergencyName>");
        System.out.println("Peek");
        System.out.println("Remove");
        System.out.println("HowMany");
        System.out.println("Panic");
    }

    void add(String emergency)
    {
        emergencyTasks.add(emergency);
        System.out.println(emergency + " add to the list of emergencies");
    }
    void peek()
    {
        if (emergencyTasks.size() > 0)
            System.out.println("The next emergency is " + emergencyTasks.peek());
        else
            System.out.println("Thankfully, there are no emergencies to view.");
    }
    void remove()
    {
        if (emergencyTasks.size() > 0)
        {
            System.out.println(emergencyTasks.pop() + " has been completed and removed.");
            if(emergencyTasks.size() > 0)
                System.out.println("The next emergency is " + emergencyTasks.peek());
            else
                System.out.println("That was the last emergency.");
        }
        else
        {
            System.out.println("Thankfully, there are no emergencies to remove.");
        }
    }
    void howMany()
    {
        if(emergencyTasks.size() > 0)
            System.out.println("There are currently " + emergencyTasks.size());
        else
            System.out.println("Thankfully, there are not emergencies right now.");
    }
    void panic()
    {
        System.out.println("All emergencies have been cleared. That was a close one.");
        emergencyTasks.clear();
    }
}
