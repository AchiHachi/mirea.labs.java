package lab6.mirea;

public class StudentIT extends Student{
    public StudentIT(int mark, String name){
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
