package org.rahul.stockservice.Rest;

import org.rahul.stockservice.Service.IStockPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class StockServiceController {

    @Autowired
    private IStockPriceService stockPriceService;


    @RequestMapping("/stockprice/{companyName}")
    public ResponseEntity<Double> fetchStockPrice(@PathVariable String companyName){

        return new ResponseEntity<>(stockPriceService.fetchByCompanyName(companyName), HttpStatus.OK);
    }



}
