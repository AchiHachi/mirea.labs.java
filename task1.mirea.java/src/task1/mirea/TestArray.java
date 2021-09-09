package task1.mirea;

import java.util.Scanner;

// Laboratory work on the discipline "Programming in the Java language"
// The work was carried out by a student of the INBO-09-20 group
// The program was written by Babichev Ilia Igorevich

public class TestArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array (2 to 5): ");
        int n = in.nextInt();

        ArrayWithLoop arr = new ArrayWithLoop(n);
        arr.getArray();
    }
}
