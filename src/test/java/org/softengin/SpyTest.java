package org.softengin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SpyTest {

    @Test
    public void spying() throws Exception {
        Stock realStock = new Stock("A", BigDecimal.ONE);
        Stock spyStock = spy(realStock);
        //call real method from spy
        assertEquals("A", spyStock.getStockCode());
        //Changing value using spy
        spyStock.setPrice(BigDecimal.ZERO);
        //verify spy has the changed value
        assertEquals(BigDecimal.ZERO, spyStock.getPrice());
        //Stubbing method
        when(spyStock.getPrice()).thenReturn(BigDecimal.TEN);
        //Changing value using spy
        spyStock.setPrice(new BigDecimal("7"));
        //Stubbed method value 10.00 is returned NOT 7
        assertNotEquals(new BigDecimal("7"),
                spyStock.getPrice());
        //Stubbed method value 10.00
        assertEquals(BigDecimal.TEN, spyStock.getPrice());
    }
}
