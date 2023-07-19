package app.task02.views;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class AppView {
    public static void getOutput(List<String> products) {
        AtomicInteger counter = new AtomicInteger(1);
        products.stream()
                .map(product -> counter.getAndIncrement() + ") " + product)
                .forEach(System.out::println);
    }
}
