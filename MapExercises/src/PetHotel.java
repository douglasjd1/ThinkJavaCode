
import java.util.*;

public class PetHotel
{
    public static void main(String[] args)
    {
        run();
    }
    static void run()
    {
        Map<Integer, ArrayList> petOccupants = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the pet hotel!");
        System.out.println("Enter one of the following commands: ");
        System.out.println();
        printCommands();

        boolean go = true;
        final int roomNumberMin = 100;
        final int roomNumberMax = 109;

        while(go)
        {
            String commandLine = scanner.nextLine();
            String[] commands = commandLine.split(" ");
            String command = commands[0].toUpperCase();
            boolean isOccupied = false;


            if(command.equals("CHECKIN"))
            {
                String petName = commands[1];

                if(commands.length!=3)
                {
                    System.out.println("That is an invalid entry.");
                }
                else
                {
                    int room = Integer.valueOf(commands[2]);

                    for (int roomNumber : petOccupants.keySet())
                    {
                        if (roomNumber == room)
                        {
                            isOccupied = true;
                        }
                    }

                    if (room < roomNumberMin || room > roomNumberMax)
                    {
                        System.out.println("That is not a valid room number. Try again.");
                        System.out.println();

                    }

                    else if (isOccupied)
                    {
                        if(petOccupants.get(room).size() > 3)
                        {
                            System.out.println("Sorry, there are too many pets in this room already. Pick a different room.");
                        }
                        else
                        {
                            System.out.println("Checked " + petName + " in to room " + room);
                            petOccupants.get(room).add(petName);
                        }
                    }

                    else
                    {
                        ArrayList<String> petGroup = new ArrayList<>();
                        petOccupants.put(room, petGroup);
                        petOccupants.get(room).add(petName);
                        System.out.println("Checked " + petName + " in to room " + room);
                        System.out.println();
                    }
                }

            }

            else if(command.equals("CHECKOUT"))
            {
                boolean isInRoom = false;
                int room = Integer.valueOf(commands[1]);

                if(commands.length==2)
                {
                    System.out.println("Checked all pets out of room " + room);
                    petOccupants.remove(Integer.valueOf(commands[1]));
                }

                else if(commands.length==3)
                {
                    String petName = commands[2];
                    int petIndex = 0;
                    for(int i = 0;i < petOccupants.get(room).size();i++)
                    {
                        if(petOccupants.get(room).get(i).equals(petName))
                        {
                            isInRoom = true;
                            petIndex = i;
                        }
                    }

                    if(isInRoom)
                    {
                        petOccupants.get(room).remove(petName);
                        System.out.println(petName + " was checked out from room " + room);
                    }
                    else
                    {
                        System.out.println("Sorry, that pet is not in that room.");
                    }
                }
            }

            else if(command.equals("MOVE"))
            {
                isOccupied = false;
                int currentRoom = Integer.valueOf(commands[1]);
                int nextRoom = Integer.valueOf(commands[2]);

                for(int roomNumber : petOccupants.keySet())
                {
                    if(roomNumber == nextRoom)
                    {
                        isOccupied = true;
                    }
                }

                if(currentRoom<roomNumberMin || currentRoom > roomNumberMax ||
                   nextRoom<roomNumberMin || nextRoom > roomNumberMax
                  )
                {
                    System.out.println("One of those room numbers is invalid. Try again.");
                    System.out.println();
                }

                else if(isOccupied)
                {
                    System.out.println("The room you want to move to is occupied. Please pick another room.");
                }

                else
                {
                    System.out.println("Moved " + petOccupants.get(currentRoom) + " to room " + nextRoom);
                    petOccupants.put(nextRoom,petOccupants.get(currentRoom));
                }
            }

            else if(command.equals("SWAP"))
            {
                int firstRoom = Integer.valueOf(commands[1]);
                int secondRoom = Integer.valueOf(commands [2]);
                int holder = Integer.valueOf(commands[1]);

                System.out.println(petOccupants.get(secondRoom) + " is now in room " + firstRoom + " and " + petOccupants.get(firstRoom) + " is now in room " + secondRoom);

                petOccupants.put(firstRoom, petOccupants.get(secondRoom));
                petOccupants.put(secondRoom, petOccupants.get(holder));

            }

            else if(command.equals("MOVEUP"))
            {
                System.out.println("All pets were moved into the next room up.");
                Map<Integer, ArrayList> holder = new TreeMap<>();

                for(Map.Entry<Integer, ArrayList> entry : petOccupants.entrySet())
                {
                    int room = entry.getKey() + 1;
                    if(room > roomNumberMax)
                    {
                        room = roomNumberMin;
                    }
                    holder.put(room,entry.getValue());
                }
                petOccupants = holder;
            }

            else if(command.equals("MOVEDOWN"))
            {
                System.out.println("All pets were moved into the next room down.");
                Map<Integer, ArrayList> holder = new TreeMap<>();

                for(Map.Entry<Integer, ArrayList> entry : petOccupants.entrySet())
                {
                    int room = entry.getKey() - 1;
                    if(room < roomNumberMin)
                    {
                        room = roomNumberMax;
                    }
                    holder.put(room,entry.getValue());
                }
                petOccupants = holder;
            }

            else if(command.equals("OCCUPANCY"))
            {
                if(petOccupants.size()==0)
                {
                    System.out.println("There are no pets currently checked in");
                }
                else
                {
                    Set printPets = petOccupants.entrySet();
                    System.out.println("Pet occupants: " + printPets);
                }
            }

            else if(command.equals("CLOSEFORSEASON"))
            {
                petOccupants.clear();
                System.out.println("All pets have been checked out.");
            }

            else if(command.equals("SHOWCOMMANDS"))
            {
                printCommands();
            }

            else if(command.equals("EXIT"))
            {
                go = false;
                System.out.println("Thank you for using this system. Goodbye!");
            }

            else
            {
                System.out.println("That is an invalid command.");
            }

            if(go)
                System.out.println("Enter another command: (To view commands, enter ShowCommands) ");
        }
    }

    public static void printCommands()
    {
        System.out.println("CheckIn <petName> <roomNumber(100 - 109)>");
        System.out.println("CheckOut <petName> <roomNumber");
        System.out.println("Move <fromRoomNumber> <toRoomNumber");
        System.out.println("Swap <firstRoomNumber> <secondRoomNumber>");
        System.out.println("MoveUp");
        System.out.println("MoveDown");
        System.out.println("Occupancy");
        System.out.println("CloseForSeason");
        System.out.println("Exit");
    }
}
