import java.util.Scanner;
import java.util.Random;
public class Employee
{
    public static void main(String[] args)
    {
        int birthYear = 1999;
        boolean isUnionMember = true;
        String fName = "Josiah";
        String mName = "David";
        String lName = "Douglas";
        int employeeNumber;
        Scanner scanner = new Scanner(System.in);

        printHeader();
        System.out.println("Please enter your 5 digit employee number:");
        employeeNumber = scanner.nextInt();

        printFullName(fName,mName,lName);

        printUnionStatus(isUnionMember);

        printAge(birthYear);

        printEvenOrOdd(employeeNumber);

        printGenerateSecretPassword(employeeNumber);
    }

    public static void printHeader()
    {
        System.out.println("Welcome to the WallabyTech Employee Application");
        System.out.println("===============================================");
    }

    public static void printFullName(String first, String middle, String last)
    {
        System.out.println(last + ", " + first + " " + middle);
    }

    public static void printUnionStatus(boolean unionMember)
    {
        System.out.println("Your union status is: " + unionMember );
    }

    public static void printAge(int age)
    {
        age = 2018 - age;
        System.out.println("Your age is: " + age);
    }

    public static void printEvenOrOdd(int evenOdd)
    {
        evenOdd %=2;
        System.out.println("Employee number is : " + evenOdd);
    }

    public static void printGenerateSecretPassword(int eNum)
    {
        Random random = new Random();

        int ranNum = random.nextInt(10) + 1;
        int password = (eNum + ranNum) * 5;

        System.out.println("Employee's random secret pw is: " + password);
    }

}
