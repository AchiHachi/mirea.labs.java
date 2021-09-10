package task2.mirea;

public class Hand {
    private boolean tattoo;
    private int fingers;

    public Hand(boolean tattoo){
        this.tattoo = tattoo;
        this.fingers = 10;
    }

    public void setTattoo(boolean tattoo){
        this.tattoo = tattoo;
    }

    public void setFingers(int fingers){
        this.fingers = fingers;
    }

    public boolean getTattoo(){
        return this.tattoo;
    }

    public int getFingers(){
        return fingers;
    }
}

