package lab6.mirea;

public class SortingStudentsByGPA {
    public int compare(Student h1, Student h2){
        if (h1.getMark() == h2.getMark()) {
            return 0;
        }
        if (h1.getMark() > h2.getMark()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
