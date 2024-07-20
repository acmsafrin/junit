package org.softengin;

public class Broker {
    public void trade(StockManager stockManager,Stock stock){
        stockManager.sellStock(stock);
    }
}
