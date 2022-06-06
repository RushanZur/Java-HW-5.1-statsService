package ru.netology.stats;

public class StatsService {
    public long minSales(long[] sales) {
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
    public long totalSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSales(long[] sales) {
        long averageSales = totalSum(sales) / sales.length;
        return averageSales;
    }

    public long numberMonthMaxSales(long[] items) {
        long max = getMax(items);
        int mounth = 1;
        int numberMonthMaxSales = 0;
        for (long item : items) {
            if (item == max) {
                numberMonthMaxSales = mounth;
            }
            mounth++;
        }

        return numberMonthMaxSales;

    }

    public long getMax(long[] items) {
        long max = items[0];
        for (long item : items) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

    public long getMin(long[] items) {
        long min = items[0];
        for (long item : items) {
            if (item < min) {
                min = item;
            }
        }
        return min;
    }

    public long monthCountMore(long[] items) {
        long avg = averageSales(items);
        int count = 0;
        for (long item : items) {
            if (item > avg) {
                count++;
            }
        }
        return count;
    }
    //Кол-во месяцев, в которых продажи были выше среднего (см. п.2)
    public long monthCountLess(long[] items) {
        long avg = averageSales(items);
        int count = 0;
        for (long item : items) {
            if (item < avg) {
                count++;
            }
        }
        return count;

    }
}
