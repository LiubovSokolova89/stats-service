package ru.netology.stats;

public class StatsService {

    public long salesAmount(long[] sales) {
        long sale = sales[0];
        long sum = 0;
        for (long num : sales) {
            sum = sum + num;
        }
        return sum;
    }

    public long getAverageAmount(long[] sales) {
        long averageAmount = sales[0];
        long sum = 0;
        for (long num : sales) {
            sum += num;
        }
        return sum / sales.length;
    }

    public int getMaxDay(int[] sales) {
        int maxDay = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxDay]) {
                maxDay = i;
            }
        }
        return maxDay;
    }

    public int getMinDay(int[] sales) {
        int minDay = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minDay]) {
                minDay = i;
            }
        }
        return minDay;
    }

    public int getMonthsLessAverageSales(long[] sales) {
        int minMonths = 0;
        long averageSales = getAverageAmount(sales);
        for (long sale : sales) {
            if (sale < averageSales) {
                minMonths++;
            }
        }
        return minMonths;
    }

    public int getMonthsMoreAverageSale(long[] sales) {
        int maxMonths = 0;
        long averageSales = getAverageAmount(sales);
        for (long sale : sales) {
            if (sale > averageSales) {
                maxMonths++;
            }
        }
        return maxMonths;
    }
}





