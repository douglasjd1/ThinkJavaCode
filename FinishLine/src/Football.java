import java.util.SortedMap;
import java.util.Scanner;

public class Football
{
    private int yardsToFirst = 10;

    private static Die die1 = new Die();
    private static Die die2 = new Die();

    private static Peg redPeg = new Peg();
    private static Peg bluePeg = new Peg();

    private Scanner in = new Scanner(System.in);

    public void play()
    {
        redPeg.setPosition(20);
        while(redPeg.getScore()<28&&bluePeg.getScore()<28)
        {
            takeTurn(redPeg, bluePeg);
            System.out.println("Red's score is now: " + redPeg.getScore());

            takeTurn(bluePeg, redPeg);
            System.out.println("Blue's score is now: " + bluePeg.getScore());
        }


        if(redPeg.getScore()>bluePeg.getScore())
        {
            System.out.println("Red wins with " + redPeg.getScore() + " points and blue had " + bluePeg.getScore());
        }

        if(bluePeg.getScore()>redPeg.getScore())
        {
            System.out.println("Blue wins with " + bluePeg.getScore() + " points and red had " + redPeg.getScore());
        }

        if(bluePeg.getScore()==redPeg.getScore())
        {
            System.out.println("The game was a tie at " + redPeg.getPosition() + " points! What a game!");
        }
    }

    private void takeTurn(Peg peg, Peg otherPeg)
    {
        int down = 1;
        int yardsToFirst = 10;
        String punt = "";
        while (down<5)
        {
            System.out.println();
            die1.roll();
            die2.roll();

            System.out.println("Down: " + down);
            System.out.println("Yards to TD: " + (100 - peg.getPosition()));
            System.out.println("Yards to first: " + yardsToFirst);
            System.out.println("The roll is: " + (die1.getValue() + die2.getValue()));


            if (die1.getValue() + die2.getValue() == 2)
            {
                System.out.println("Touchdown!!!!!!!!");
                peg.scoreUp(6);

                die1.roll();
                if(die1.getValue()>=5)
                {
                    System.out.println("The extra point is good!");
                    peg.scoreUp(1);
                }

                otherPeg.setPosition(20);
                down=5;
            }

            if (die1.getValue() + die2.getValue() == 3)
            {
                System.out.println("Interception!");
                System.out.println("What a job on defense! It's a turnover!");

                otherPeg.setPosition(100-(peg.getPosition()-10));
                break;
            }

            if (die1.getValue() + die2.getValue() == 4)
            {
                peg.setPosition(peg.getPosition()+20);
                System.out.println("It's a reverse for a gain of 20 yards! Amazing!");
                yardsToFirst-=20;
                down++;
            }

            if (die1.getValue() + die2.getValue() == 5)
            {
                System.out.println("The quaterback is sacked for a huge loss!");
                if(peg.getPosition()>10)
                    peg.setPosition(peg.getPosition()-10);
                else
                    peg.setPosition((0));
                yardsToFirst+=10;
                down++;
            }

            if (die1.getValue() + die2.getValue() == 6)
            {
                peg.setPosition(peg.getPosition()+5);
                System.out.println("Its a draw for a gain of 5");
                yardsToFirst-=5;
                down++;
            }

            if (die1.getValue() + die2.getValue() == 7)
            {
                System.out.println("Incomplete pass over the middle");
                down++;
            }

            if (die1.getValue() + die2.getValue() == 8)
            {
                peg.setPosition(peg.getPosition()+5);
                System.out.println("The quarterback completes a simple screen pass for 5 yards");
                yardsToFirst-=5;
                down++;
            }

            if (die1.getValue() + die2.getValue() == 9)
            {
                System.out.println("What a pass down the middle! It's a 25 yard gain!");
                peg.setPosition(peg.getPosition()+25);
                yardsToFirst-=25;
                down++;
            }

            if (die1.getValue() + die2.getValue() == 10)
            {
                System.out.println("They stuffed that run!");
                    down++;
            }

            if (die1.getValue() + die2.getValue() == 11)
            {
                System.out.println("It's a fumble!");
                down = 5;
            }

            if (die1.getValue() + die2.getValue() == 12)
            {
                peg.setPosition(peg.getPosition()+30);
                System.out.println("What a throw, a 30 yard gain!");
                yardsToFirst-=30;
                down++;
            }

            if(peg.getPosition()>=100)
            {
                System.out.println("Touchdown!!!!!!!!!");
                peg.scoreUp(6);
                die1.roll();
                if(die1.getValue()>=5)
                {
                    System.out.println("The extra point is good!");
                    peg.scoreUp(1);
                }
                otherPeg.setPosition(20);
                break;
            }

            if(yardsToFirst<=0)
                down=1;
            if(yardsToFirst<=0)
                yardsToFirst=10;

            if(down==4)
            {
                System.out.println("It's fourth down. Would you like to punt? (Y/N)");
                punt = in.nextLine();

                if(punt.equals("y")||punt.equals("Y"))
                {
                    die1.roll();
                    otherPeg.setPosition(peg.getPosition()-(10*die1.getValue()));
                    System.out.println("The ball was punted " + (10*die1.getValue()) + " yards");
                    break;
                }
            }

            if(down>4)
            {
                System.out.println("What a job on defense, its a turnover!");
                otherPeg.setPosition(100-peg.getPosition());
            }
        }
    }
}
