package com.liuyujie.demo.test;


import java.io.Serializable;
import java.math.BigDecimal;

public class AmcItemType implements Serializable {
    private static final long serialVersionUID = -72223978024696646L;
    private String itemSmallType;
    private int itemCounts;
    private BigDecimal percentage;

    public AmcItemType() {
    }

    public AmcItemType(String itemSmallType, int itemCounts, BigDecimal percentage) {
        this.itemSmallType = itemSmallType;
        this.itemCounts = itemCounts;
        this.percentage = percentage;
    }

    public String getItemSmallType() {
        return this.itemSmallType;
    }

    public void setItemSmallType(String itemSmallType) {
        this.itemSmallType = itemSmallType;
    }

    public int getItemCounts() {
        return this.itemCounts;
    }

    public void setItemCounts(int itemCounts) {
        this.itemCounts = itemCounts;
    }

    public BigDecimal getPercentage() {
        return this.percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "AmcItemType{" +
                "itemSmallType='" + itemSmallType + '\'' +
                ", itemCounts=" + itemCounts +
                ", percentage=" + percentage +
                '}';
    }
}
