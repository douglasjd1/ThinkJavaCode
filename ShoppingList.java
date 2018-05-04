package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShoppingList
{
    public static void main(String[] args)
    {
        ShoppingList shoppingList = new ShoppingList();

        run();
    }

    public static void run()
    {
        Scanner scanner = new Scanner(System.in);
        boolean go = true;

        System.out.println("Welcome to my store. Go buy something.");

        List<ListItem> shoppingList = new ArrayList<>();

        while(go)
        {
            System.out.println("Enter one of the following commands:");
            System.out.println();
            System.out.println("Add <item name>");
            System.out.println("Print");
            System.out.println("Remove <item number>");
            System.out.println("Find");
            System.out.println("Clear");
            System.out.println("Exit");

            String commandLine = scanner.nextLine();
            String[] commands = commandLine.split(" ");
            String command = commands[0].toUpperCase();

            boolean isInList = false;
            int itemIndex=0;
            if(command.equals("ADD"))
            {
                String itemName = commands[1];
                for(int i = 0;i<shoppingList.size();i++)
                {
                    if(commands[1].equals(shoppingList.get(i).getName()))
                    {
                        isInList = true;
                        itemIndex = i;
                    }
                }
                if(isInList&&shoppingList.get(itemIndex).getQuantity()<6)
                {
                    shoppingList.get(itemIndex).quantityUp();
                }
                if(isInList&&shoppingList.get(itemIndex).getQuantity()>=6)
                {
                    System.out.println("I'm sorry, Dave, I'm afraid I can't do that.");
                }
                if(!isInList)
                {
                    shoppingList.add(new ListItem(commands[1]));
                }
            }

            else if(command.equals("PRINT"))
            {
                if(shoppingList.size()==0)
                {
                    System.out.println("Your shopping list is empty");
                    System.out.println();
                }
                for(int i=0;i<shoppingList.size();i++)
                {
                    System.out.println(i+1+". " + shoppingList.get(i).getName() + ", " + shoppingList.get(i).getQuantity());
                }
            }

            else if(command.equals("REMOVE"))
            {
                boolean isInteger = false;
                int index = 0;

                for(int i = 1;i<shoppingList.size();i++)
                {
                    if(commands[1].equals(String.valueOf(i)));
                        isInteger = true;
                }

                if(isInteger)
                {
                    index = Integer.parseInt(commands[1]);

                    if (index < shoppingList.size() || index > shoppingList.size())
                    {
                        System.out.println("That's not a valid item number. Try again.");
                        System.out.println();
                    }

                    else
                    {
                        shoppingList.get(index - 1).quantityDown();
                        if (shoppingList.get(index - 1).getQuantity() <= 0)
                        {
                            shoppingList.remove(index - 1);
                        }
                    }
                }

                else
                {
                    System.out.println("That is not a valid item number.");
                    System.out.println();
                }

            }

            else if(command.equals("CLEAR"))
            {
                shoppingList.clear();
            }

            else if(command.equals("FIND"))
            {
                isInList = false;

                if(shoppingList.size()==0)
                {
                    System.out.println("Your shopping list is empty");
                    System.out.println();
                }

                for(int i = 0;i<shoppingList.size();i++)
                {
                    if(commands[1].equals(shoppingList.get(i).getName()))
                    {
                        isInList = true;
                        itemIndex = i;
                    }
                }
                if(isInList)
                {
                    System.out.println("Found it! It is item number " + (itemIndex + 1));
                    System.out.println();
                }
                else
                {
                    System.out.println("No such item");
                    System.out.println();
                }
            }
            else if(command.equals("EXIT"))
            {
                go=false;
            }

            else
            {
                System.out.println("That's not a valid command. Try again.");
                System.out.println();
            }

        }
    }

}
