package lab7;

public class TestMain {
    public static void main(String[] args) {
        StackCore DrunkGame = new StackCore();

        DrunkGame.setDecks();
        DrunkGame.getDecks();
        DrunkGame.setStacks();

        DrunkGame.CompareStacks();
    }
}
