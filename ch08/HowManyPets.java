import java.util.Scanner;

public class HowManyPets
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");

        int numPets = scanner.nextInt();
        scanner.nextLine();
        String[] pets = new String[numPets];
        String petName;

        for(int i=0;i<pets.length;i++)
        {
            System.out.println("Enter the name of your pet: ");

            petName = scanner.nextLine();
            pets[i] = petName;
        }

        System.out.println("Your pets are: ");
        for(int i = 0;i<pets.length;i++)
        {
            System.out.println(pets[i]);
        }
    }
}
