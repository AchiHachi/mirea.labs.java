package lab6.mirea;

public class Student {
    private int mark;
    private String name;

    public Student(int mark, String name){
        this.mark = mark;
        this.name = name;
    }

    public int getMark(){
        return mark;
    }

    @Override
    public String toString() {
        return "Student[" +
                "mark = " + mark +
                ", name = '" + name + "'" +
                ']';
    }
}
