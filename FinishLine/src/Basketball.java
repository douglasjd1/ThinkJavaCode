public class Basketball
{
    private static int roundNumber = 0;
    private static int gameNumber = 0;

    private static Die die1 = new Die();
    private static Die die2 = new Die();

    private static Peg redPeg = new Peg();
    private static Peg bluePeg = new Peg();

    public void play()
    {
        while(bluePeg.getPosition()<22&&redPeg.getPosition()<22)
        {
            takeTurn(bluePeg);
            System.out.println("Blue has: " + bluePeg.getPosition() + " points");
            System.out.println();

            takeTurn(redPeg);
            System.out.println("Red has: " + redPeg.getPosition() + " points");
            System.out.println();
        }

        if(redPeg.getPosition()>bluePeg.getPosition())
            System.out.println("Red wins with " + redPeg.getPosition() + " points!");
        if(bluePeg.getPosition()>redPeg.getPosition())
            System.out.println("Blue wins with " + bluePeg.getPosition() + " points!");
        if(bluePeg.getPosition()==redPeg.getPosition())
            System.out.println("Wow what a game! It ended in a tie!");
    }

    private void takeTurn(Peg peg)
    {
        die1.roll();
        die2.roll();

        System.out.println("The roll is: " + (die1.getValue() + die2.getValue()));

        if(die1.getValue()+die2.getValue()==2)
        {
            peg.positionUp();
            peg.positionUp();
            peg.positionUp();
            System.out.println("There's a three pointer!");
        }

        if(die1.getValue()+die2.getValue()==3)
        {
            System.out.println("Walking violation, unlucky!");
        }

        if(die1.getValue()+die2.getValue()==4)
        {
            peg.positionUp();
            peg.positionUp();
            System.out.println("The two point shot is good!");
        }

        if(die1.getValue()+die2.getValue()==5)
        {
            peg.positionUp();
            System.out.println("He converts one foul shot!");
        }

        if(die1.getValue()+die2.getValue()==6)
        {
            peg.positionUp();
            peg.positionUp();
            System.out.println("Two point shot!");
        }

        if(die1.getValue()+die2.getValue()==7)
        {
            System.out.println("Double dribble violation, unlucky!");
        }

        if(die1.getValue()+die2.getValue()==8)
        {
            peg.positionUp();
            peg.positionUp();
            System.out.println("He converts both foul shots!");
        }

        if(die1.getValue()+die2.getValue()==9)
        {
            System.out.println("Ohh, close but no cigar!");
        }

        if(die1.getValue()+die2.getValue()==10)
        {
            peg.positionUp();
            peg.positionUp();
            peg.positionUp();
            System.out.println("Wow, he made it from downtown!");
        }

        if(die1.getValue()+die2.getValue()==11)
        {
            System.out.println("Offensive foul, unlucky!");
        }

        if(die1.getValue()+die2.getValue()==12)
        {
            peg.positionUp();
            peg.positionUp();
            peg.positionUp();
            System.out.println("A wonderful three point shot!");
        }


    }
}
