package im.andychu.learn.jdk21lts;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * <a href="https://openjdk.org/jeps/444">
 *  JEP 444: Virtual Threads
 * </a>
 * @author andy.chu 2024/4/6
 */
@Slf4j
public class JEP444 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        try(var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            var future1 = executor.submit(() -> "Hello");
            var future2 = executor.submit(() -> "World");
            log.info("{} {}", future1.get(), future2.get());
        }

        Thread.Builder ofVirtual = Thread.ofVirtual().name("duke-", 0);
        ofVirtual.start(() -> log.info("apple"));

        Thread.startVirtualThread(() -> log.info("banana"));

        ThreadFactory factory = Thread.ofVirtual().name("work-", 0).factory();
        factory.newThread(() -> log.info("candy")).start();
        factory.newThread(() -> log.info("donut")).start();
    }
}
