package task4.mirea;

public class Earth implements Nameable {
    private int radius = 6371;
    private boolean gas = false;
    private boolean life = true;

    public String getName(){
        return "\nThe object name is 'Earth'\n";
    }

    public String toString(){
        return "radius = " + radius + "km" +
                "\nisGas - " + gas +
                "\nlife - " + life;
    }
}
