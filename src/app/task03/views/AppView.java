package app.task03.views;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class AppView {
    public static void getOutput(List<String> filteredDays, Map<String, Integer> tempData) {
        AtomicInteger counter = new AtomicInteger(1);
        filteredDays.stream()
                .map(day -> {
                    String dayName = day.substring(day.indexOf(". ") + 2);
                    int temp = tempData.get(dayName);
                    return String.format("%d. %s - Temperature: %d°C", counter.getAndIncrement(), dayName, temp);
                })
                .forEach(System.out::println);
    }
}
