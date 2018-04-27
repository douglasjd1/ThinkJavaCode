public class PlayerTest
{
    public static void main(String[] args)
    {
        Player aguero = new Player("Aguero");

        System.out.println("Aguero's score: "+ aguero.getScore());
        aguero.increaseScore();
        System.out.println("Aguero scored! His score is now: " + aguero.getScore());
        aguero.increaseScore();
        System.out.println("Aguero scored again! His score is now: " + aguero.getScore());
        aguero.resetScore();
        System.out.println("Game over. Aguero's score is now: " + aguero.getScore());
    }
}
