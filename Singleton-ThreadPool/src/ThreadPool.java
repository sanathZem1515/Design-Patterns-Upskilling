public class ThreadPool {

    private static int size = 10;
    private static volatile ThreadPool threadPoolObject = null;
    public static volatile int count = size;


    public static ThreadPool getInstance() {
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



