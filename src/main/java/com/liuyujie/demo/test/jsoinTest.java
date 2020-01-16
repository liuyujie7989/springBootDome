package com.liuyujie.demo.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: springBootDome
 * @description:
 * @author: liuyishou
 * @create: 2019-11-01 14:39
 **/
public class jsoinTest {
    public static void main(String[] args) {
        AmcItemTypeBoList amcItemTypeBoList = new AmcItemTypeBoList();
        List<AmcItemType> amcList= new ArrayList<>();
        //AmcItemType amcItemTypeBO = new AmcItemType();
        List<AmcItemTypeStatisticBO> amcItemTypeStatisticBOS = new ArrayList<>();
        String json="{\"amcItemTypeStatisticBOList\":[{\"itemCounts\":3657,\"itemSmallType\":\"FW\",\"percentage\":19.825},{\"itemCounts\":756,\"itemSmallType\":\"JF\",\"percentage\":4.098},{\"itemCounts\":84,\"itemSmallType\":\"JL\",\"percentage\":0.455},{\"itemCounts\":991,\"itemSmallType\":\"QR\",\"percentage\":5.372},{\"itemCounts\":7271,\"itemSmallType\":\"QT\",\"percentage\":39.418},{\"itemCounts\":5687,\"itemSmallType\":\"XK\",\"percentage\":30.831}]}";
        JSONObject jsonObject = JSON.parseObject(json);
        JSONArray amcItemTypeStatisticBOList = jsonObject.getJSONArray("amcItemTypeStatisticBOList");
        List<AmcItemTypeStatisticBO> amcItemTypeStatisticBOS1 = JSONObject.parseArray(amcItemTypeStatisticBOList.toJSONString(), AmcItemTypeStatisticBO.class);
        for (AmcItemTypeStatisticBO amcItemTypeStatisticBO : amcItemTypeStatisticBOS1) {
            AmcItemType amcItemTypeBO = new AmcItemType();
            BeanUtils.copyProperties(amcItemTypeStatisticBO,amcItemTypeBO);
            amcList.add(amcItemTypeBO);
        }
        amcItemTypeBoList.setAmc(amcList);

        System.out.println(JSONObject.toJSONString(amcList));
    }
}
