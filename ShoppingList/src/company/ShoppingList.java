package company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingList
{
    public static void main(String[] args)
    {
        ShoppingList shoppingList = new ShoppingList();

        run();
    }

    private static void run()
    {
        Scanner scanner = new Scanner(System.in);
        boolean go = true;

        System.out.println("Welcome to my store. Go buy something.");

        List<ListItem> shoppingList = new ArrayList<>();

        while(go)
        {
            System.out.println("Enter one of the following commands:");
            System.out.println();
            System.out.println("Add <item name> <Number of items>");
            System.out.println("Print");
            System.out.println("Remove <item number> <nmber of items>");
            System.out.println("Find");
            System.out.println("Clear");
            System.out.println("Exit");

            String commandLine = scanner.nextLine();
            String[] commands = commandLine.split(" ");
            String command = commands[0].toUpperCase();

            int quantity = 0;

            if(commands.length == 3)
            {
                try
                {
                    quantity = Integer.parseInt(commands[2]);
                }
                catch(Exception e)
                {
                    System.out.println(commands[2] + " is not a valid number. Try again.");
                }
            }

            boolean isInList = false;
            int itemIndex = 0;
            if(command.equals("ADD"))
            {
                if(commands.length > 3)
                {
                    System.out.println("Please enter only the item name and quantity.");
                }
                String itemName = commands[1];
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
                    if(commands.length == 2)
                    {
                        shoppingList.get(itemIndex).quantityUp();
                    }
                    if(commands.length == 3)
                    {
                        shoppingList.get(itemIndex).addQuantity(quantity);
                    }
                }

                if(!isInList)
                {
                    if(commands.length == 3)
                    {
                        shoppingList.add(new ListItem(commands[1], quantity));
                    }

                    else
                    {
                        shoppingList.add(new ListItem(commands[1], quantity));
                    }
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
                    if(commands[1].equals(String.valueOf(i)))
                    {
                        isInteger = true;
                    }
                }

                if(isInteger)
                {
                    try
                    {
                        index = Integer.parseInt(commands[1]);
                    }
                    catch(Exception e)
                    {
                        //do something
                    }

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
