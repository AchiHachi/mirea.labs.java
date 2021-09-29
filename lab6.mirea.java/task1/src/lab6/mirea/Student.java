package lab6.mirea;

public class Student implements Comparable<Student>{
    private String name;
    private int IdNumber;

    public Student(String name, int IdNumber){
        this.name = name;
        this.IdNumber = IdNumber;
    }

    public String toString(){
        return name + ": " + IdNumber;
    }

    public int compareTo(Student anotherStudent)
    {
        if (this.IdNumber == anotherStudent.IdNumber) {
            return 0;
        } else if (this.IdNumber < anotherStudent.IdNumber) {
            return -1;
        } else {
            return 1;
        }
    }

}
