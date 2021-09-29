package lab6.mirea;

import java.util.Comparator;

public class Student {
    private String name;
    private int mark;

    public Student(int mark, String name){
        this.name = name;
        this.mark = mark;
    }

    public int getMark(){
        return mark;
    }

    public String toString(){
        return name + ": " + mark;
    }
}
