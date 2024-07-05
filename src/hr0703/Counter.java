package hr0703;

public class Counter {
    private int state = 0;

    public void increment(){
        state++;
    }

    public int get(){
        return state;
    }
}
