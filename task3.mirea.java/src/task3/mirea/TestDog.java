package task3.mirea;

// Laboratory work on the discipline "Programming in the Java language"
// The work was carried out by a student of the INBO-09-20 group
// The program was written by Babichev Ilia Igorevich

public class TestDog {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Pug(5, true);
        dogs[1] = new Pitbull(15, false);
        dogs[2] = new Pug(7,false);

        for (Dog Dog : dogs)
            System.out.println(Dog);
    }
}
