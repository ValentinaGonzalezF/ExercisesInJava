package com.cc3002.patterns.doubledispatch.money;

public interface IMoney {
    double getMoney();
    IMoney add(IMoney money);
    USD addToUSD(USD usd);
    CLP addToCLP(CLP clp);
    JPY addToJPY(JPY jpy);
}
