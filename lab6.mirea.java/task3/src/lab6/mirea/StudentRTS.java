package lab6.mirea;

public class StudentRTS extends Student{
    public StudentRTS(int mark, String name){
        super(mark, name);
    }

    public String toString(){
        return name + ": " + mark;
    }

    @Override
    public int getMark() {
        return mark;
    }
}
