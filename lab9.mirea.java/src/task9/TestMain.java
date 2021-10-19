package task9;

// Laboratory work on the discipline "Programming in the Java language"
// The work was carried out by a student of the INBO-09-20 group
// The program was written by Babichev Ilia Igorevich

public class TestMain {
    public static void main(String[] args) {
        Account acc1 = new Account("364432", "Андрей");
        Account.Check(acc1);

        Account acc2 = new Account("3644322343114", "Петька");
        Account.Check(acc2);

        Account acc3 = new Account("3644322353", "Исмаил");
        Account.Check(acc3);
    }
}
