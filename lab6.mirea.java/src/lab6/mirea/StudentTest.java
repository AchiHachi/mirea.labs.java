package lab6.mirea;

import java.util.Arrays;

// Laboratory work on the discipline "Programming in the Java language"
// The work was carried out by a student of the INBO-09-20 group
// The program was written by Babichev Ilia Igorevich

public class StudentTest {
    public static void main(String[] args) {

        Student[] arr = new Student[5];

        arr[0] = new Student(100, "Han-Chu");
        arr[1] = new Student(78, "Ilia");
        arr[2] = new Student(68, "Anna");
        arr[3] = new Student(74, "Polina");
        arr[4] = new Student(87, "Roman");

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