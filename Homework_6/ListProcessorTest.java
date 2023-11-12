package Homework_6;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class ListProcessorTest {
    ListProcessor listProcessor = new ListProcessor();

    @Test
    public void testCalculateAverage() {
        assertEquals(2.0, listProcessor.calculateAverage(Arrays.asList(1, 2, 3)), 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateAverageEmptyList() {
        listProcessor.calculateAverage(Collections.emptyList());
    }

    @Test
    public void testCompareAverages() {
        assertEquals("Первый список имеет большее среднее значение",
                listProcessor.compareAverages(Arrays.asList(1, 2, 3), Arrays.asList(1, 2)));
        assertEquals("Второй список имеет большее среднее значение",
                listProcessor.compareAverages(Arrays.asList(1, 2), Arrays.asList(1, 2, 3)));
        assertEquals("Средние значения равны",
                listProcessor.compareAverages(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3)));
    }
    @Test
    public void testCalculateAverageWithZeroList() {
        assertEquals(0.0, listProcessor.calculateAverage(Arrays.asList(0, 0, 0, 0)), 0.0);
    }

    @Test
    public void testCompareAveragesWithEqualLargeLists() {
        List<Integer> largeList = Arrays.asList(new Integer[1000]);
        Collections.fill(largeList, 5);
        assertEquals("Средние значения равны",
                listProcessor.compareAverages(largeList, largeList));
    }

    @Test
    public void testCompareAveragesWithLargeDifferentLists() {
        List<Integer> largeList1 = Arrays.asList(new Integer[10000]);
        Collections.fill(largeList1, 1);
        List<Integer> largeList2 = Arrays.asList(new Integer[10000]);
        Collections.fill(largeList2, 2);
        assertEquals("Второй список имеет большее среднее значение",
                listProcessor.compareAverages(largeList1, largeList2));
    }
}