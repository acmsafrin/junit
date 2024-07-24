package org.softengin;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ArgsCaptureTest {

    @Mock
    StockManager stockManager;

    Broker broker;

    @Before
    public void setUp() {
        broker = new Broker(stockManager);
    }

    @Test
    public void capture() throws Exception {
        Stock stock = new Stock("A", BigDecimal.ONE);


        ArgumentCaptor<Stock> stockCaptor =
                ArgumentCaptor.forClass(Stock.class);

        broker.trade(stock);
        verify(stockManager).sellStock(stockCaptor.capture());

        assertEquals(BigDecimal.ONE,stockCaptor.getValue().getPrice());
    }
}
