package lab2.mirea;

// Laboratory work on the discipline "Programming in the Java language"
// The work was carried out by a student of the INBO-09-20 group
// The program was written by Babichev Ilia Igorevich

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Sue Grant", 'm', "sugrant@somewhere.com");
        System.out.println(a1);
        a1.setEmail("sgrant@gmail.com");
        System.out.println(a1);

    }
}
