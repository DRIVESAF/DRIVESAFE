package top.zhf.java.basic.compare;

import org.junit.Test;

import static org.junit.Assert.*;

public class comparetoolsTest {

    @Test
    public void compare() {
        int a = 12;
        int b = 34;
        int c = 20;
        assertEquals(20, comparetools.compare(b));
    }
}