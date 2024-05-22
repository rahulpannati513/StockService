package org.rahul.stockservice.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "STOCK_PRICE")
public class StockPrice {

    @Id
    @Column(name = "STOCK_ID")
    private Integer stockid;

    @Column(name = "COMPANY_NAME")
    private String companyName;

    @Column(name = "COMPANY_PRICE")
    private Double companyPrice;

    public StockPrice() {
    }

    public StockPrice(Integer stockid, String companyName, Double companyPrice) {
        this.stockid = stockid;
        this.companyName = companyName;
        this.companyPrice = companyPrice;
    }

    public Integer getStockid() {
        return stockid;
    }

    public void setStockid(Integer stockid) {
        this.stockid = stockid;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Double getCompanyPrice() {
        return companyPrice;
    }

    public void setCompanyPrice(Double companyPrice) {
        this.companyPrice = companyPrice;
    }
}
