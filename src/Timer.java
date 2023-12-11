import static java.util.concurrent.TimeUnit.SECONDS;

import java.util.concurrent.*;

public class Timer {
    public static void main(String[] args) {

        final ScheduledExecutorService scheulder = Executors.newScheduledThreadPool(1);
        final Runnable runnable = new Runnable() {
            int start = 20;

            @Override
            public void run() {
                System.out.println(start);
                start--;
                if (start < 0) {
                    System.out.println("Timer over");
                    scheulder.shutdown();
                }
            }
        };
        scheulder.scheduleAtFixedRate(runnable, 0, 2, SECONDS);
    }

}
