package task9;

public class Verification  extends Exception{
    public Verification(Account client){
        super("Имя: " + client.getName() + " \nИНН: " + client.getInn() + " - недействителен\n");
    }

}
