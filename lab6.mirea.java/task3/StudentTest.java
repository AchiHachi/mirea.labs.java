package lab6.mirea;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTest {

    public static void main(String[] args) {

        ArrayList <ITStudent> studensIT = new ArrayList<>();
        ArrayList <RTSStudent> studentsRTS = new ArrayList<>();
        ArrayList <Student> students = new ArrayList<>();

        studensIT.add(new ITStudent(19,3,"Denis"));
        studensIT.add(new ITStudent(18,1,"Andrey"));
        studensIT.add(new ITStudent(20,2,"Nikita"));

        studentsRTS.add(new RTSStudent(21,2, "Ivan"));
        studentsRTS.add(new RTSStudent(18,3, "Ilya"));
        studentsRTS.add(new RTSStudent(19,1, "Alexsandr"));

        students.addAll(studensIT);
        students.addAll(studentsRTS);

        Collections.sort(students, Student.IDcomparator);

        System.out.println("Отсортированный список студентов по ID: ");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, Student.NameComparator);

        System.out.println("Отсортированный список студентов по имени: ");
        for (Student student : students) {
            System.out.println(student);
        }

        Collections.sort(students, Student.AgeComparator);

        System.out.println("Отсортированный список студентов по возрастату: ");
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
