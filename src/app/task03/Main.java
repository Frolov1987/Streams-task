package app.task03;

import app.task03.utils.Constants;

import java.util.List;
import java.util.Map;

import static app.task03.provider.DataProvider.getData;
import static app.task03.service.DataService.filterTemp;
import static app.task03.views.AppView.getOutput;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> tempData = getData();

        int minTemp = Constants.MIN_TEMP;
        int maxTemp = Constants.MAX_TEMP;
        List<String> filteredDays = filterTemp(tempData, minTemp, maxTemp);
        getOutput(filteredDays, tempData);
    }
}
