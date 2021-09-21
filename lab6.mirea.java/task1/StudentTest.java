package lab6.mirea;

import java.util.Arrays;

// Laboratory work on the discipline "Programming in the Java language"
// The work was carried out by a student of the INBO-09-20 group
// The program was written by Babichev Ilia Igorevich

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[5];

        arr[0] = new Student(0, "Anna");
        arr[1] = new Student(3, "Roman");
        arr[2] = new Student(4, "Polina");
        arr[3] = new Student(2, "Ilia");
        arr[4] = new Student(1, "Han-Chu");

        System.out.println("Список студентов:");
        for(Student student : arr){
            System.out.println(student);
        }

        System.out.println();
        Arrays.sort(arr, Student.sortIDNumber);

        System.out.println("Список студентов по айди:");
        for(Student student : arr){
            System.out.println(student);
        }
    }
}
