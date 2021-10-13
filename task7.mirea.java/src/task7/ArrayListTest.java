package task7;

import java.util.ArrayList;

// Laboratory work on the discipline "Programming in the Java language"
// The work was carried out by a student of the INBO-09-20 group
// The program was written by Babichev Ilia Igorevich

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Integer> digitsList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            digitsList.add((int) (Math.random() * 20));
        }

        System.out.println("8-ой Элемент списка: " + digitsList.get(8));

        System.out.println("Весь список: ");
        for (Integer integer : digitsList)
            System.out.print(integer + " ");

        digitsList.remove(5);
        System.out.println("\nУдален 5-ый элемент списка. \nНовый список: ");

        for (Integer integer : digitsList)
            System.out.print(integer + " ");

    }
}
