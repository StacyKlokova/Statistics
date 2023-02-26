package ru.netology.javaqa.javaqamvn.services;

public class StatsService {

    public long totalSales(long[] sales) {
        long total = 0;
        for (long sale : sales) {
            total = total + sale;

        }
        return total;
    }

    public long averageSales(long[] sales) {
        long salesMonth = totalSales(sales) / sales.length;

        return salesMonth;
    }

    public int maxMonthSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minMonthSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int lowAverageSales(long[] sales) {
        int lowSales = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                lowSales++;
            }
        }
        return lowSales;
    }


    public int highAverageSales(long[] sales) {
        int result = 0;
        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                result++;
            }
        }
        return result;
    }


}
