
public class Main {
    public static void main(String[] args) {

        ThreadPool t = ThreadPool.getInstance2();
        
        Thread t1 = new Thread(new Task("A"));
        Thread t2 = new Thread(new Task("B"));
        Thread t3 = new Thread(new Task("C"));
        Thread t4 = new Thread(new Task("D"));
        Thread t5 = new Thread(new Task("E"));

        t.execute(t1);
        t.execute(t2);
        t.execute(t3);
        t.execute(t4);
        t.execute(t5);

    }
}