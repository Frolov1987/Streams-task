package app.task02;

import java.util.List;
import java.util.Map;

import static app.task02.provider.DataProvider.getData;
import static app.task02.service.DataService.filterProducts;
import static app.task02.views.AppView.getOutput;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> products = getData();

        double maxPrice = 2.00;
        List<String> filteredProducts = filterProducts(products, maxPrice);
        getOutput(filteredProducts);
    }
}
