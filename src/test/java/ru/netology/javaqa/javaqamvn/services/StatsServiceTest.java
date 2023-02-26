package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void totalSales() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long expectedTotal = 180; //сумма всех чисел
        long actualTotal = service.totalSales(sales);

        Assertions.assertEquals(expectedTotal, actualTotal);
    }

    @Test
    public void averageSales() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long expectedAverage = 15; //сумма всех чисел 180 : 12 (месяцев)
        long actualAverage = service.averageSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void maxMonthSales() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long expectedMaxMonth = 8;
        long actualMaxMonth = service.maxMonthSales(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void minMonthSales() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMinMonth = 9;
        int actualMinMoth = service.minMonthSales(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMoth);
    }

    @Test
    public void lowAverageSales() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedLowAverageSales = 5;
        int actualLowAverageSales = service.lowAverageSales(sales);

        Assertions.assertEquals(expectedLowAverageSales, actualLowAverageSales);
    }

    @Test
    public void highAverageSales() {
        StatsService service = new StatsService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedHighAverageSales = 5;
        int actualHighAverageSales = service.highAverageSales(sales);

        Assertions.assertEquals(expectedHighAverageSales, actualHighAverageSales);
    }

}
