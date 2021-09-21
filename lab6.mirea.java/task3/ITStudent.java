package lab6.mirea;

public class ITStudent extends Student {

    public ITStudent(int age, int ID, String fisrtName) {
        super(age, ID, fisrtName);
    }

    public ITStudent(int ID, String fisrtName) {
        super(ID, fisrtName);
    }

    @Override
    String getCourse() {
        return "IT";
    }
}