package com.PriceTableTest;


import company.PriceTable;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

@RunWith(Parameterized.class)
public class PriceTableTest {

    private String firstValue;
    private int secondValue;
    private int expectedValue;

    public PriceTableTest(String firstValue, int secondValue, int expectedValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.expectedValue = expectedValue;
    }

    @Parameterized.Parameters
    public static Collection parameters() {
        return Arrays.asList(new Object[][] {
                {"Jan", 1, 1},
                {"Feb", 2, 14},
                {"Aug", 1, 8}
        });
    }

    @Test
    public void test3() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);

        PriceTable test = new PriceTable(list);
        int result = test.getPrice(firstValue, secondValue);
        assertEquals(expectedValue, result);

    }
}

