package lab6.mirea;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getMark() - s2.getMark();
    }
}
