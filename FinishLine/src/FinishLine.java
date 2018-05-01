public class FinishLine
{
    private static int roundNumber = 0;
    private static int gameNumber = 0;

    private static Die die1 = new Die();
    private static Die die2 = new Die();

    private static Peg redPeg = new Peg();
    private static Peg bluePeg = new Peg();

    private static int redWin = 0;
    private static int blueWin = 0;
    private static int tie = 0;

    public void play()
    {
        gameNumber++;
        System.out.println("Game number: " + gameNumber);

        redPeg.positionUp();
        bluePeg.positionUp();

        while (redPeg.getPosition() < 10 && bluePeg.getPosition() < 10)
        {
            roundNumber++;
            System.out.println("Round number: " + roundNumber);
            takeTurn(redPeg);
            System.out.print("Red position: " + redPeg.getPosition() + "\t");

            takeTurn(bluePeg);
            System.out.println("Blue position: " + bluePeg.getPosition());
            System.out.println();
        }

        resetRound();

        if (redPeg.getPosition() == bluePeg.getPosition())
        {
            System.out.println("It was a tie! Both pegs ended up at 10");
            tie++;
            System.out.println();
        }

        else if (bluePeg.getPosition() == 10)
        {
            System.out.println("Blue won!");
            blueWin++;
        }

        else if (redPeg.getPosition() == 10)
        {
            System.out.println("Red won!");
            redWin++;
        }

        bluePeg.resetPosition();
        redPeg.resetPosition();
    }

    public static int getRedWin()
    {
        return redWin;
    }

    public static int getBlueWin()
    {
        return blueWin;
    }

    public static int getTie()
    {
        return tie;
    }

    private static void takeTurn(Peg peg)
    {
        System.out.println();

        die1.roll();
        die2.roll();

        if (peg.getNextPosition() == die1.getValue() ||
            peg.getNextPosition() == die2.getValue() ||
            peg.getNextPosition() == die1.getValue() + die2.getValue())

            peg.positionUp();
    }

    public void resetRound()
    {
        roundNumber=0;
    }

    public static int getGameNumber()
    {
        return gameNumber;
    }
}
