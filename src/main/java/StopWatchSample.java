import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

public class StopWatchSample {
    public static void main(String[] args) throws InterruptedException {
        Stopwatch sw = Stopwatch.createStarted();

        while(true) {
            System.out.println(sw.elapsed(TimeUnit.SECONDS) + "sec");
            Thread.sleep(5000);
            if (sw.elapsed(TimeUnit.SECONDS) > 30) {
                sw.stop();
                sw.reset();
                System.out.println("Done");
                break;
            }
        }
//        0sec
//        5sec
//        10sec
//        15sec
//        20sec
//        25sec
//        30sec
//        Done
    }
}
