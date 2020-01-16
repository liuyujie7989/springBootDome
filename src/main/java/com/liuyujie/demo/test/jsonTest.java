package com.liuyujie.demo.test;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: springBootDome
 * @description:
 * @author: liuyishou
 * @create: 2019-09-20 11:38
 **/
public class jsonTest {
    public static void main(String[] args) {
String jsonStr ="{\n" +
        "            \"code\": \"00\",\n" +
        "            \"msg\": \"成功\",\n" +
        "            \"data\": \"\",\n" +
        "            \"datas\": {\"code\":\"1\",\"msg\":\"成功\",\"data\":{\"interCount\":324208,\"classifyInter\":[{\"num\":71,\"classifyName\":\"人口综合库\"},{\"num\":4,\"classifyName\":\"信用信息库\"},{\"num\":20,\"classifyName\":\"办事材料库\"},{\"num\":2,\"classifyName\":\"宏观经济库\"},{\"num\":46,\"classifyName\":\"数据共享\"},{\"num\":77,\"classifyName\":\"法人综合库\"},{\"num\":48,\"classifyName\":\"电子证照库\"}],\"inter\":268,\"classifyInterCount\":[{\"num\":616864,\"classifyName\":\"人口综合库\"},{\"num\":518,\"classifyName\":\"信用信息库\"},{\"num\":70753,\"classifyName\":\"办事材料库\"},{\"num\":21,\"classifyName\":\"宏观经济库\"},{\"num\":1283,\"classifyName\":\"数据共享\"},{\"num\":177754,\"classifyName\":\"法人综合库\"},{\"num\":346658,\"classifyName\":\"电子证照库\"}]}},\n" +
        "            \"requestId\": \"50024acc875e4b82824289152430fa74\",\n" +
        "            \"dataCount\": 1\n" +
        "        }";
        Map<String, String> classifyInterMap = new HashMap<>();
        Map<String, String> classifyInterCountMap = new HashMap<>();
        JSONObject shareDate = JSON.parseObject(jsonStr);
        if (shareDate.containsKey("datas")) {
            JSONObject datasObject = shareDate.getJSONObject("datas");
            if (datasObject.containsKey("data")) {
                    JSONObject dataJSONObject = datasObject.getJSONObject("data");
                if (dataJSONObject.containsKey("classifyInter")) {
                    JSONArray classifyInterArray = dataJSONObject.getJSONArray("classifyInter");
                    for (int j = 0; j < classifyInterArray.size(); j++) {
                        JSONObject classifyInterArrayJSONArray = classifyInterArray.getJSONObject(j);
                        String classifyNameStr = (String) classifyInterArrayJSONArray.get("classifyName");
                        String numStr = classifyInterArrayJSONArray.get("num")+"";
                        classifyInterMap.put(classifyNameStr,numStr);
                    }
                }
                if (dataJSONObject.containsKey("classifyInterCount")) {
                    JSONArray classifyInterCountArray = dataJSONObject.getJSONArray("classifyInterCount");
                    for (int j = 0; j < classifyInterCountArray.size(); j++) {
                        JSONObject classifyInterArrayJSONArray = classifyInterCountArray.getJSONObject(j);
                        String classifyNameStr = (String) classifyInterArrayJSONArray.get("classifyName");
                        String numStr =  classifyInterArrayJSONArray.get("num")+"";
                        classifyInterCountMap.put(classifyNameStr,numStr);
                    }
                }
            }
        }

            for (String s : classifyInterMap.keySet()) {
                String value = classifyInterMap.get(s);
                System.out.println(s+"--"+value);
            }
        for (String s : classifyInterCountMap.keySet()) {
            String value = classifyInterCountMap.get(s);
            System.out.println(s+"--"+value);
        }

   }




    }
