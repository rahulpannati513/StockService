package org.rahul.stockservice.Service;

import org.rahul.stockservice.Entity.StockPrice;
import org.rahul.stockservice.Exceptions.StockNotFoundException;
import org.rahul.stockservice.Repository.StockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl implements  IStockPriceService{

    @Autowired
    private  StockRepo stockRepo;

    @Override
    public Double fetchByCompanyName(String companyName) {

        StockPrice sp = stockRepo.findByCompanyName(companyName);

        if(sp == null){
     throw  new StockNotFoundException("Stock Not Found");
        }
        return sp.getCompanyPrice();
    }
}
