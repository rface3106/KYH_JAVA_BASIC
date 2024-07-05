package hr0703;

public class CounterMain {
    public static void main(String[] args) {
        Counter c = new Counter();
        two(c);
        int count = c.get();
    }

    public static void two(Counter c){
        c.increment();
        c.increment();
    }
}
