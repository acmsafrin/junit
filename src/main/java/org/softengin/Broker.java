package org.softengin;

public class Broker {

    private StockManager stockManager;

    public Broker(StockManager stockManager) {
        this.stockManager = stockManager;
    }

    public void trade(Stock stock){
        stockManager.sellStock(stock);
    }
}
