package lab6.mirea;

public class RTSStudent extends Student {

    public RTSStudent(int age, int ID, String fisrtName) {
        super(age, ID, fisrtName);
    }

    public RTSStudent(int ID, String fisrtName) {
        super(ID, fisrtName);
    }

    @Override
    String getCourse() {
        return "RTS";
    }
}