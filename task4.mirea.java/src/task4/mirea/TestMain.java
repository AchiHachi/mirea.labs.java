package task4.mirea;

// Laboratory work on the discipline "Programming in the Java language"
// The work was carried out by a student of the INBO-09-20 group
// The program was written by Babichev Ilia Igorevich

public class TestMain {
    public static void main(String[] args) {
        Earth earth = new Earth();
        Lada lada = new Lada();
        Vodka vodka = new Vodka();

        System.out.println(earth.getName() + earth);
        System.out.println(lada.getName() + lada);
        System.out.println(vodka.getName() + vodka);
    }
}
