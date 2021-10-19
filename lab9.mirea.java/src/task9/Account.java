package task9;

public class Account {
    private String inn;
    private String name;

    public Account(String inn, String name){
        this.inn = inn;
        this.name = name;
    }

    public String getInn(){
        return inn;
    }

    public String getName(){
        return name;
    }

    public void checkInn(String inn) throws Verification{
        if(inn.length() != 10){
            throw new Verification(this);
        }
    }

    public static void Check(Account acc){
        try{
            acc.checkInn(acc.getInn());
            System.out.println("Имя: " + acc.getName() + " \nИНН: " + acc.getInn() + " - действителен\n");
        }
        catch (Verification e){
            System.out.println(e.getMessage());
        }
    }
}
