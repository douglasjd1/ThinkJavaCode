public class Player
{
    private String name;
    private int score;

    public Player(String name)
    {
        this.name=name;
        this.score = 0;
    }

    public int getScore()
    {
        return score;
    }

    public int increaseScore()
    {

        return this.score++;
    }

    public void resetScore()
    {
        score = 0;
    }
}
