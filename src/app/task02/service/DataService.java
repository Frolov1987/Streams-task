package app.task02.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DataService {
    public static List<String> filterProducts(Map<String, Double> products, double maxPrice) {
        return products.entrySet().stream()
                .filter(entry -> entry.getValue() <= maxPrice)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
