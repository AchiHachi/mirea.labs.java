package lab6.mirea;

import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[5];

        arr[0] = new Student(100, "Han-Chu");
        arr[1] = new Student(78, "Roman");
        arr[2] = new Student(69, "Anna");
        arr[3] = new Student(72, "Ilia");
        arr[4] = new Student(87, "Polina");

        System.out.println("Список студентов: ");
        for (Student student : arr) {
            System.out.println(student);
        }

        System.out.println("\nОтсортированный список студентов: ");
        Arrays.sort(arr, new SortingStudentsByGPA().reversed());

        for (Student student : arr) {
            System.out.println(student);
        }
    }
}
