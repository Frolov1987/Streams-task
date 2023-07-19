package app.task01;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Task01 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Alice", "Bob", "Mark", "Arnold", "Anna", "Emma");

        String startsWith = "A";
        AtomicInteger counter = new AtomicInteger(1);
        Stream<String> filteredStream = filterNames(stream, startsWith);
        getOutput(filteredStream, counter);
    }

    public static Stream<String> filterNames(Stream<String> stream, String startingLetter) {
        return stream.filter(name -> name.startsWith(startingLetter));
    }

    public static void getOutput(Stream<String> stream, AtomicInteger counter) {
        stream.map(name -> counter.getAndIncrement() + ". " + name)
                .forEach(System.out::println);
    }
}

