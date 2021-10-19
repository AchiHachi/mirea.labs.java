package task9;

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
