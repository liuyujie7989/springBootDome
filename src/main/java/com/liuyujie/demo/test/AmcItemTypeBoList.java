package com.liuyujie.demo.test;

import java.util.List;

/**
 * @program: springBootDome
 * @description:
 * @author: liuyishou
 * @create: 2019-11-04 11:45
 **/
public class AmcItemTypeBoList {
    private  List<AmcItemType> amc;

    public AmcItemTypeBoList() {
    }

    public AmcItemTypeBoList(List<AmcItemType> amc) {
        this.amc = amc;
    }

    public List<AmcItemType> getAmc() {
        return amc;
    }

    @Override
    public String toString() {
        return "AmcItemTypeBoList{" +
                "amc=" + amc +
                '}';
    }

    public void setAmc(List<AmcItemType> amc) {
        this.amc = amc;
    }
}
