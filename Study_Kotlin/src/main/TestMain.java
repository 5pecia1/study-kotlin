package main;

import java.util.function.Consumer;

/**
 * Created by sol on 2016-12-21.
 */
public class TestMain {
    public static void main (String[] args) {
        Consumer<Float> consumer = System.out::println;

        useConsumer(consumer);
    }

    static void useConsumer(Consumer<Float> consumer) {
        consumer.accept(10f);
    }
}
