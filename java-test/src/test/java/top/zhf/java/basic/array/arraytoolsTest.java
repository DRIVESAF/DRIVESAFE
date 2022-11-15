package top.zhf.java.basic.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class arraytoolsTest {

    @Test
    public void getMax() {
        int[] array = new int[]{3,6,9,8,7,4,5,1};

        assertEquals(9,arraytools.getMax(array));
    }
}