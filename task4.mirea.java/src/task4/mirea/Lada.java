package task4.mirea;

public class Lada implements Nameable {
    private int mileage = 221000;
    private String model = "Trenashka";

    public String getName(){
        return "\nThe object name is 'Lada'\n";
    }

    public String toString(){
        return "mileage = " + mileage + "km" +
                "\nmodel - " + model;
    }
}
