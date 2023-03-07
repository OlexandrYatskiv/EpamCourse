import java.util.concurrent.TimeUnit;

public class ThreadStates {
    public static void main(String[] args) throws InterruptedException {
        var stats = new Stats();
        var t2  = new Thread(stats::increment);
        var t1 = new Thread(stats::increment);
        System.out.println(t1.getState());
        t1.start();
       t2.start();
        System.out.println(t1.getState());
        TimeUnit.SECONDS.sleep(1);
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        t1.join();
        t2.join();
        System.out.println(t1.getState());
    }
}
