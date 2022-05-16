package ru.netology.javaqa;

public class StatsService {

    public long calculateSum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverage(long[] sales) {
        int average = 0;
        if (sales.length > 0) {
            int sum = 0;
            for (int i = 0; i < sales.length; i++) {
                sum += sales[i];
            }
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
        long averageb = 0;
        long belowAverage = 0;
        if (sales.length > 0) {
            int sum = 0;
            for (int i = 0; i < sales.length; i++) {
                sum += sales[i];
            }
            averageb = sum / sales.length;
            belowAverage = 0;
            for (int i = 0; i < sales.length; i++) {
                if (sales[i] < averageb) {
                    belowAverage ++;
                }
            }
        }

        return belowAverage;
    }

    public long findUnderAverage(long[] sales) {
        long averagec = 0;
        long underAverage = 0;
        if (sales.length > 0) {
            int sum = 0;
            for (int i = 0; i < sales.length; i++) {
                sum += sales[i];
            }
            averagec = sum / sales.length;
            underAverage = 0;
            for (int i = 0; i < sales.length; i++) {
                if (sales[i] > averagec) {
                    underAverage ++;
                }
            }
        }

        return underAverage;
    }
}


