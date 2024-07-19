package org.softengin;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TimeoutTest {
    @Rule
    public Timeout globalTimeout =
            new Timeout(20);
    @Test
    public void testInfiniteLoop1() throws InterruptedException{
        Thread.sleep(10);
    }
}
