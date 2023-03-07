import lombok.SneakyThrows;

import java.util.concurrent.TimeUnit;

public class Deadlock {


    public static void main(String[] args) throws InterruptedException {
        var stats1 = new Stats();
        var stats2 = new Stats();
             var t1 = new Thread(() -> {synchronized (stats1)
        {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            stats2.increment();
        }});
        var t2 = new Thread(() -> {synchronized (stats2)
        {
            stats1.increment();
        }});
var statePrinter  = new Thread(() -> {
   while (true){
    System.out.println(t1.getState());
    System.out.println(t2.getState());

   }});
statePrinter.start();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}