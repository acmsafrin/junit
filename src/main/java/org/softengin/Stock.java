package org.softengin;

import java.math.BigDecimal;

public class Stock {
    private BigDecimal price;
    private String stockCode;


    public Stock( String stockCode,BigDecimal price) {
        this.price = price;
        this.stockCode = stockCode;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }
}
