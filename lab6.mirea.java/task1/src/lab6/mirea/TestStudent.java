package lab6.mirea;

public class TestStudent {
    public static void main(String[] args) {
        Sorting sort = new Sorting();
        Student[] student = new Student[5];
        student[0] = new Student("Alex", 34);
        student[1] = new Student("Mihael", 53);
        student[2] = new Student("Abba", 35);
        student[3] = new Student("Who?", 85);
        student[4] = new Student("Dina", 73);

        sort.insertionSort(student);
    }
}
