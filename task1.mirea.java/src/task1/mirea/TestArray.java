package task1.mirea;

import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива (от 2 по 5): ");
        int n = in.nextInt();

        ArrayWithLoop arr = new ArrayWithLoop(n);
        arr.getArray();
    }
}
