public class ThreadPool {

    private static int size = 10;
    private volatile ThreadPool threadPoolObject = null;
    public static volatile int count = size;

    ThreadPool() {
    }

    public ThreadPool getInstance2() {
        if (threadPoolObject == null) {
            synchronized (ThreadPool.class) {
                if (threadPoolObject == null) {
                    threadPoolObject = new ThreadPool();
                }
            }
        }
        return threadPoolObject;
    }

    public void execute(Thread task) {
        if (count > 0) {
            count--;
            task.start();
        }
    }

}



