package com.liuyujie.demo.test;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//



import java.math.BigDecimal;

public class AmcItemTypeStatisticBO {
    private String itemSmallType;
    private int itemCounts;
    private BigDecimal percentage;

    public AmcItemTypeStatisticBO() {
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
        StringBuilder sb = new StringBuilder("{");
        sb.append("\"itemSmallType\":\"").append(this.itemSmallType).append('"');
        sb.append(",\"itemCounts\":").append(this.itemCounts);
        sb.append(",\"percentage\":").append(this.percentage);
        sb.append('}');
        return sb.toString();
    }
}
