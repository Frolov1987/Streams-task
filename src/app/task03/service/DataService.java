package app.task03.service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class DataService {
    public static List<String> filterTemp(Map<String, Integer> tempData, double minTemp, int maxTemp) {
        AtomicInteger counter = new AtomicInteger(1);
        return tempData.entrySet().stream()
                .filter(entry -> entry.getValue() >= minTemp && entry.getValue() <= maxTemp)
                .map(entry -> counter.getAndIncrement() + ". " + entry.getKey())
                .collect(Collectors.toList());
    }
}
