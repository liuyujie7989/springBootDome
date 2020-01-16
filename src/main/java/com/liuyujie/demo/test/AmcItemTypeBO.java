package com.liuyujie.demo.test;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @program: authority
 * @description:
 * @author: liuyishou
 * @create: 2019-09-30 14:25
 **/
public class AmcItemTypeBO implements Serializable {
   private static final long serialVersionUID = -72223978024696646L;
    private String itemSmallType;
    private int itemCounts;
    private BigDecimal percentage;

    public AmcItemTypeBO() {
    }

    public AmcItemTypeBO(String itemSmallType, int itemCounts, BigDecimal percentage) {
        this.itemSmallType = itemSmallType;
        this.itemCounts = itemCounts;
        this.percentage = percentage;
    }

    public String getItemSmallType() {
        return itemSmallType;
    }

    public void setItemSmallType(String itemSmallType) {
        this.itemSmallType = itemSmallType;
    }

    public int getItemCounts() {
        return itemCounts;
    }

    public void setItemCounts(int itemCounts) {
        this.itemCounts = itemCounts;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }
}
