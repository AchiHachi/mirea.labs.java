package task4.mirea;

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
