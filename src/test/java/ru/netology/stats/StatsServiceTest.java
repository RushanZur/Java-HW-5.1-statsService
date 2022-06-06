package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void totalSum() {
        StatsService service = new StatsService();

        long[] sales = {9, 15, 13, 15, 17, 25, 19, 25, 5, 14, 14, 18};
        long expected = 189;

        long actual = service.totalSum(sales);
        assertEquals(expected , actual);
    }
    @org.junit.jupiter.api.Test
    void averageSales(){
        StatsService service = new StatsService();
        long[] sales = {9, 15, 13, 15, 17, 25, 19, 25, 5, 14, 14, 18};
        long expected = 15;

        long actual = service.averageSales(sales);
        assertEquals(expected,actual);
    }
    @Test
    void numberMonthMaxSales (){
        StatsService service = new StatsService();
        long[] sales = {9, 15, 13, 15, 17, 25, 19, 25, 5, 14, 14, 18};
        long expected = 8;

        long actual = service.numberMonthMaxSales(sales);
        assertEquals(expected,actual);
    }

    @Test
    void minSales (){
        StatsService service = new StatsService();
        long[] sales = {9, 15, 13, 15, 17, 25, 19, 25, 5, 14, 14, 18};
        long expected = 9;

        long actual = service.minSales(sales);
        assertEquals(expected,actual);
    }
    @Test
    void shouldReturnMoreThanAvg (){
        long[] items = {9, 15, 13, 15, 17, 25, 19, 25, 5, 14, 14, 18};

        StatsService service = new StatsService();
        long actual = service.monthCountMore(items);

        long expected = 5;
        assertEquals(expected,actual);
    }

    @Test
    void shouldReturnLessThanAvg (){
        long[] items = {9, 15, 13, 15, 17, 25, 19, 25, 5, 14, 14, 18};

        StatsService service = new StatsService();
        long actual = service.monthCountLess(items);

        long expected = 5;
        assertEquals(expected,actual);
    }
}
