public class Task implements Runnable{
    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try{
            System.out.println("Started "+name);
            Thread.sleep(2000);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("Finished "+name);
    }
}
