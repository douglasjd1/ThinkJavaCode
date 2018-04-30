public class RoundAbout
{
    private static int roundNumber = 0;
    private static int gameNumber = 0;

    private static Die die1 = new Die();
    private static Die die2 = new Die();

    private static Peg redPeg = new Peg();
    private static Peg bluePeg = new Peg();

    public void play()
    {
        redPeg.resetPosition();
        bluePeg.resetPosition();

        gameNumber++;

        while(redPeg.getPosition()<11&&bluePeg.getPosition()<11)
        {
            takeTurn(redPeg);
            System.out.print("Red position: " + redPeg.getPosition() + "\t");

            if(redPeg.getPosition()==bluePeg.getPosition())
            {
                if(bluePeg.getPosition()>0)
                    System.out.println("Red knocked blue back to start!");
                bluePeg.resetPosition();
            }

            takeTurn(bluePeg);
            System.out.println("Blue position: " + bluePeg.getPosition());

            if(redPeg.getPosition()==bluePeg.getPosition())
            {
                if(redPeg.getPosition()>0)
                    System.out.println("Blue knocked red back to start!");

                redPeg.resetPosition();

            }
        }

        if(bluePeg.getPosition()==11)
            System.out.println("Blue won!");
        if(redPeg.getPosition()==11)
            System.out.println("Red won!");
    }

    private static void takeTurn(Peg peg)
    {
        System.out.println();

        die1.roll();
        die2.roll();

        System.out.println(die1.getValue());
        System.out.println(die2.getValue());

        if(peg.getPosition()==0)
        {
            if (die1.getValue()==5||
                die2.getValue()==5||
                die1.getValue()+die2.getValue()==5)
                    peg.positionUp();
        }

        if(peg.getPosition()>0)
        {
            if (peg.getNextPosition() == die1.getValue() ||
                peg.getNextPosition() == die2.getValue() ||
                peg.getNextPosition() == die1.getValue() + die2.getValue())
                    peg.positionUp();
        }
    }
}
