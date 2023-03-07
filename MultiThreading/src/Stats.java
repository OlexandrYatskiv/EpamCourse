import lombok.SneakyThrows;

import java.util.concurrent.TimeUnit;


public class Stats {

  private Long counter = 0L;



   synchronized void increment()  {
     counter++;
       try {
           TimeUnit.SECONDS.sleep(5);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
   }


    public long getincrement()
    {
        return counter;
    }

}
