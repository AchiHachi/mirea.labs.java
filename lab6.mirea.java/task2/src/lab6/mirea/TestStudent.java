package lab6.mirea;

import java.util.Arrays;

public class TestStudent {
    public static void main(String[] args) {
        Sorting sort = new Sorting();
        Student[] studArr = new Student[5];

        studArr[0] = new Student(65, "Vanya");
        studArr[1] = new Student(78, "Boris");
        studArr[2] = new Student(29, "Anna");
        studArr[3] = new Student(12, "Nikita");
        studArr[4] = new Student(97, "Oleg");
        sort.quickSort(studArr, 0, 4);
        System.out.println(Arrays.toString(studArr));
    }
}
