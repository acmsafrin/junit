package org.softengin;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockTest {
    @Mock
    Factorial factorial;

    @Before
    public void setUp() {
       // MockitoAnnotations.initMocks(this);
    }
    @Test
    public void sanity() throws Exception {
        Assert.assertNotNull(factorial);
    }
}
