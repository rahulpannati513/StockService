package org.rahul.stockservice.Service;

import org.rahul.stockservice.Entity.StockPrice;

public interface IStockPriceService {

    public Double fetchByCompanyName(String companyName);

}
