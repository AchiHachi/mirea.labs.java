package task8;

public class BoundedWaitList<E> extends WaitList<E> {
    private final int capacity;

    public BoundedWaitList(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }

    public void add(E element){
        if(this.content.size() < this.capacity){
            super.add(element);
        }
    }

    public String toString(){
        return this.content.toString() + ". Capacity = " + this.capacity;
    }
}
