package ru.netology.javaqa;

public class StatsService {

    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long calculateAverage(long[] sales) {
        long average = 0;
        long sum = calculateSum(sales);
        {
            average = sum / sales.length;
        }

        return average;
    }

    public long findMax(long[] sales) {
        long currentMax = sales[0];
        for (long sale : sales) {
            if (currentMax < sale) {
                currentMax = sale;
            }
        }
        return currentMax;

    }

    public long findMin(long[] sales) {
        long currentMin = sales[0];
        for (long sale : sales) {
            if (currentMin > sale) {
                currentMin = sale;
            }
        }
        return currentMin;

    }

    public long findBelowAverage(long[] sales) {
        long belowAverage = 0;
        long average = calculateAverage(sales);
            for (int i = 0; i < sales.length; i++) {
                if (sales[i] < average) {
                    belowAverage++;
            }
        }

        return belowAverage;
    }

    public long findUnderAverage(long[] sales) {
        long underAverage = 0;
        long average = calculateAverage(sales);
            for (int i = 0; i < sales.length; i++) {
                if (sales[i] > average) {
                    underAverage++;
            }
        }

        return underAverage;
    }
}


