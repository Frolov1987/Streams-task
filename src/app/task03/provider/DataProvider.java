package app.task03.provider;
import java.util.LinkedHashMap;
import java.util.Map;

public class DataProvider {
    public static Map<String, Integer> getData() {
        Map<String, Integer> tempData = new LinkedHashMap<>();
        tempData.put("Monday", 11);
        tempData.put("Tuesday", 9);
        tempData.put("Wednesday", 10);
        tempData.put("Thursday", 12);
        tempData.put("Friday", 15);
        tempData.put("Saturday", 8);
        tempData.put("Sunday", 10);
        return tempData;
    }
}
