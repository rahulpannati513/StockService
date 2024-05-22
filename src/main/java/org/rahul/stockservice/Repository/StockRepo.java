package org.rahul.stockservice.Repository;

import org.rahul.stockservice.Entity.StockPrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepo extends JpaRepository<StockPrice, String> {

    public StockPrice findByCompanyName(String companyName);
}
