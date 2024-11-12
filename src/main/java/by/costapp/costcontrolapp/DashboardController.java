package by.costapp.costcontrolapp;

import javafx.fxml.FXML;
import javafx.scene.chart.*;

public class DashboardController {

    @FXML
    private PieChart pieChart;

    @FXML
    private BarChart<String, Number> barChart;

    @FXML
    private LineChart<String, Number> lineChart;

    @FXML
    private CategoryAxis barChartXAxis;

    @FXML
    private NumberAxis barChartYAxis;

    @FXML
    private CategoryAxis lineChartXAxis;

    @FXML
    private NumberAxis lineChartYAxis;

    @FXML
    public void initialize() {
        addDataToPieChart();
        addDataToBarChart();
        addDataToLineChart();
    }

    private void addDataToPieChart() {
        PieChart.Data slice1 = new PieChart.Data("Категория A", 30);
        PieChart.Data slice2 = new PieChart.Data("Категория B", 25);
        PieChart.Data slice3 = new PieChart.Data("Категория C", 45);

        pieChart.getData().addAll(slice1, slice2, slice3);
    }

    private void addDataToBarChart() {
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Доходы");

        series.getData().add(new XYChart.Data<>("Январь", 200));
        series.getData().add(new XYChart.Data<>("Февраль", 150));
        series.getData().add(new XYChart.Data<>("Март", 300));

        barChart.getData().add(series);
    }

    private void addDataToLineChart() {
        XYChart.Series<String, Number> incomeSeries = new XYChart.Series<>();
        incomeSeries.setName("Доходы");

        incomeSeries.getData().add(new XYChart.Data<>("Январь", 120));
        incomeSeries.getData().add(new XYChart.Data<>("Февраль", 180));
        incomeSeries.getData().add(new XYChart.Data<>("Март", 250));

        XYChart.Series<String, Number> expenseSeries = new XYChart.Series<>();
        expenseSeries.setName("Расходы");

        expenseSeries.getData().add(new XYChart.Data<>("Январь", 100));
        expenseSeries.getData().add(new XYChart.Data<>("Февраль", 150));
        expenseSeries.getData().add(new XYChart.Data<>("Март", 200));

        lineChart.getData().addAll(incomeSeries, expenseSeries);
    }
}
