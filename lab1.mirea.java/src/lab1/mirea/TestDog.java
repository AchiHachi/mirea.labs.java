package lab1.mirea;

// Laboratory work on the discipline "Programming in the Java language"
// The work was carried out by a student of the INBO-09-20 group
// The program was written by Babichev Ilia Igorevich

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog("Helen", 7);
        Dog d3 = new Dog("Bob");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}

