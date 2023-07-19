package app.task02.provider;

import java.util.LinkedHashMap;
import java.util.Map;

public class DataProvider {
    public static Map<String, Double> getData() {
        Map<String, Double> products = new LinkedHashMap<>();
        products.put("Orange", 1.05);
        products.put("Plum", 2.50);
        products.put("Cheese", 3.00);
        products.put("Lemon", 2.00);
        products.put("Grape", 2.00);
        products.put("Apricot", 3.15);
        return products;
    }
}
