package lab6.mirea;

import java.util.Comparator;

public class Student {
    private int iDNumber;
    private String name;

    public Student(int iDNumber, String name){
        this.iDNumber = iDNumber;
        this.name = name;
    }

    public int getIDNumber(){
        return iDNumber;
    }

    public static Comparator<Student> sortIDNumber = Comparator.comparing(Student::getIDNumber);

    @Override
    public String toString() {
        return "Student[iDNumber = " + iDNumber + ", Name = " + name +"]";
    }
}
