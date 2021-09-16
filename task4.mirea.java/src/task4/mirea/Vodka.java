package task4.mirea;

public class Vodka implements Nameable {
    private int alcohol = 40;
    private float liter = 0.7f;

    public String getName(){
        return "\nThe object name is 'Vodka'\n";
    }

    public String toString(){
        return "alcohol = " + alcohol + "%" +
                "\nliter - " + liter;
    }
}
