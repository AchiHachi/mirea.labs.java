package lab6.mirea;

public class Student {
    protected String name;
    protected int mark;

    public Student(int mark, String name){
        this.name = name;
        this.mark = mark;
    }

    public String toString(){
        return name + ": " + mark;
    }

    public int getMark() {
        return mark;
    }

}
