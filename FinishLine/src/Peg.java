public class Peg
{
    private int position;
    private int score;

    public Peg()
    {
        position = 0;
    }

    public int getPosition()
    {
        return position;
    }

    public void setPosition(int position)
    {
        this.position = position;
    }

    public int getNextPosition()
    {
        return position + 1;
    }

    public void positionUp()
    {
        position++;
    }

    public void resetPosition()
    {
        position = 0;
    }

    public void positionDown()
    {
        position--;
    }

    public void scoreUp(int score)
    {
        this.score+= score;
    }

    public int getScore()
    {
        return score;
    }

}
