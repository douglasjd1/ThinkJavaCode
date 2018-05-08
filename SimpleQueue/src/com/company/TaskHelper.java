package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TaskHelper
{
    Queue<String> tasks = new LinkedList<>();

    public static void main(String[] args)
    {
        TaskHelper taskHelper = new TaskHelper();

        taskHelper.run();
    }
    public void run()
    {
        String command = "";

        System.out.println("Welcome to the task manager. Here are a list of commands. At any time, enter PrintCommmands to view the commands.");
        printCommands();
        try
        {
            do
            {
                Scanner scanner = new Scanner(System.in);

                String commandLine = scanner.nextLine();

                String[] commands = commandLine.split(" ");
                command = commands[0].toUpperCase();

                if (command.equals("ADD"))
                {
                    if(commands.length >= 2)
                    {
                        addTask(commands);
                    }

                    else
                    {
                        System.out.println("I have to know what task to add. Enter some tasks this time.");
                    }
                }

                else if (command.equals("PEEK"))
                {
                    int numTasks = 0;

                    if (commands.length == 2)
                    {
                        numTasks = Integer.valueOf(commands[1]);
                        peek(numTasks, tasks);
                    }
                    else if(commands.length == 1)
                    {
                        peek(numTasks, tasks);
                    }

                    else
                    {
                        System.out.println("Invalid input. Enter Peek, then one number.");
                    }

                }

                else if (command.equals("REMOVE"))
                {
                    int numTasks = 0;

                    if (commands.length == 2)
                    {
                        numTasks = Integer.valueOf(commands[1]);
                        remove(numTasks);
                    }
                    else if(commands.length == 1)
                    {
                        remove(numTasks);
                    }

                    else
                    {
                        System.out.println("Invalid input. Enter Remove, then one number.");
                    }
                }

                else if (command.equals("HOWMANY"))
                {
                    howMany();
                }

                else if(command.equals("PRINTCOMMANDS"))
                {
                    printCommands();
                }

                else if (command.equals("FLEE"))
                {
                    flee();
                }

                else if (command.equals("EXIT"))
                {
                    exit();
                }

                else
                {
                    System.out.println("Invalid command.");
                }

                if(!command.equals("EXIT"))
                    System.out.print("Enter another command:");

            } while (!command.equals("EXIT"));
        }
        catch(Exception e)
        {
            System.out.println("Invalid input. Try another command.");
        }
    }

    public void printCommands()
    {
        System.out.println("Add <TaskName> <TaskName> ...");
        System.out.println("Peek");
        System.out.println("Remove");
        System.out.println("HowMany");
        System.out.println("Flee");
    }

    public void addTask(String[] taskNames)
    {
        for(int i = 1;i < taskNames.length;i++)
        {
            tasks.add(taskNames[i]);
            System.out.println("Added " + taskNames[i] + " to the list of tasks.");
        }
    }

    public void peek(int numTasks, Queue<String> holder)
    {
        if(tasks.size() == 1 && numTasks == 0)
            System.out.println("The next task is " + tasks.peek());

        else if(tasks.size() == 0)
        {
            System.out.println("There are no tasks in the list.");
        }

        else if(tasks.size() > 1 && numTasks <= tasks.size())
        {
            holder = new LinkedList<>();

            for(String task : tasks)
            {
                holder.add(task);
            }
            System.out.println("The next " + numTasks + " tasks are: ");

            for(int i = 0;i < numTasks;i++)
            {
                System.out.println(holder.poll());
            }
        }

        else if(numTasks > tasks.size())
        {
            System.out.println("There aren't that many tasks in the list.");
        }
        else
            System.out.println("There are no tasks left in the list.");
    }

    public void remove(int numTasks)
    {
        if(tasks.size() == 1)
        {
            System.out.println("Removed " + tasks.peek() + " from the list.");
            tasks.remove();
        }
        else if(tasks.size() > 1 && numTasks <= tasks.size())
        {
            System.out.println("Removed the following tasks: ");

            for(int i = 0;i < numTasks;i++)
            {
                System.out.println(tasks.remove());
            }
        }

        else if(numTasks > tasks.size())
        {
            System.out.println("There aren't that many tasks in the list.");
        }
        else
            System.out.println("There are no tasks left in the list.");
    }

    public void howMany()
    {
        System.out.println("Tasks left to be completed: " + tasks.size());
    }

    public void flee()
    {
        tasks.clear();
        System.out.println("All tasks have been cleared from the list.");
    }

    public void exit()
    {
        System.out.println("Thank you for using this task manager. Goodbye.");
    }
}
