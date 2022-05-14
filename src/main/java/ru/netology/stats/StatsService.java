package ru.netology.stats;

public class StatsService {
    public int sum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int arithmeticMean(long[] sales) {
        int arithmeticMean = 0;
        for (long sale : sales)
            arithmeticMean = sum(sales) / sales.length;
        return arithmeticMean;
    }

    public int maxSales(long[] sales) {
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

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int numberMonthsMinMiddle(long[] sales) {
        int numberMonthsMinMiddle = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale < arithmeticMean(sales)) {
                month++;
                numberMonthsMinMiddle = month;
            }
        }
        return numberMonthsMinMiddle;
    }

    public int numberMonthsMaxMiddle(long[] sales) {
        int numberMonthsMaxMiddle = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale > arithmeticMean(sales)) {
                month++;
                numberMonthsMaxMiddle = month;
            }
        }
        return numberMonthsMaxMiddle;
    }
}
