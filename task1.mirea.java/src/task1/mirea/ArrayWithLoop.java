package task1.mirea;

import java.util.Scanner;

public class ArrayWithLoop {
    private int n;

    public ArrayWithLoop(int n){
        this.n = n;
    }

    public void getArray(){
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while (n <= 5 & n > 1) {

            int common = 0;
            int[] array = new int[n];

            System.out.println("Введите числа массива. Прибавьте '0' для выхода: ");
            for (int i = 0; i < array.length; i++) {
                do {
                    array[i] = in.nextInt();
                    if(array[i] == 0){
                        flag = false;
                        break;
                    }
                }
                while (i > n);
            }

            for (int j : array) common = common + j;

            System.out.println("Сумма = " + common);
            if(!flag){
                break;
            }
        }
        System.out.println("Программа закончена!");
    }
}
