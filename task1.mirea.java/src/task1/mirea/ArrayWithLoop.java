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

            System.out.println("Enter the numbers in the array. Add '0' to exit: ");
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

            System.out.println("Sum = " + common);
            if(!flag){
                break;
            }
        }
        System.out.println("The programm is over!");
    }
}
