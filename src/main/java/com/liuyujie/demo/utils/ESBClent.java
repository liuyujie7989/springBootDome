package com.liuyujie.demo.utils;

import com.alibaba.fastjson.JSON;
import com.liuyujie.demo.config.IConst;
import com.liuyujie.demo.pojo.UniBss;
import com.liuyujie.demo.pojo.UniBssBody;
import com.liuyujie.demo.pojo.UniBssHead;
import com.mzlion.easyokhttp.HttpClient;
import com.mzlion.easyokhttp.response.HttpResponse;
import lombok.extern.log4j.Log4j2;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static com.liuyujie.demo.config.IConst.JSON_KEY_REQUEST_ID;

@Log4j2
public class ESBClent {


    public  static HttpResponse invokeUrl(String url,String requestId,Object data) throws Exception {

        UniBss uniBss = new UniBss();

        UniBssHead uniBssHead = uniBssHeadBuilder();

        Map<String, Object> map = new HashMap<>();
        map.put(JSON_KEY_REQUEST_ID, requestId);
        map.put("data", data);
        UniBssBody uniBssBody = uniBssBodyBuilder(map);

        uniBss.setHead(uniBssHead);
        uniBss.setBody(uniBssBody);


        HttpResponse responseData = HttpClient
                .textBody(url)
                .header("Accept-Encoding", "")
                .header("Content-Type", "application/json; charset=UTF-8")
                .header("Accept", "application/json")
                .json(JSON.toJSONString(data))
                .execute();
        return responseData;
    }

    private static UniBssHead uniBssHeadBuilder() {
        UniBss uniBss = new UniBss();

        UniBssHead head = new UniBssHead();


        Map<String, Object> map = new HashMap<>();
        Date timestamp = new Date();
        String transId = Long.toString(timestamp.getTime()) + getRandomNumberInRange(100000, 999999);

        String tokenValue = MD5Util.tokenValue(IConst.ESB_APP_ID, Long.toString(timestamp.getTime()), transId, IConst.ESB_APP_SECRET);

        head.setTimestamp(timestamp.getTime());
        head.setAppId(IConst.ESB_APP_ID);
        head.setToken(tokenValue);
        head.setTransId(transId);
        uniBss.setHead(head);

        return head;
    }

    private static UniBssBody uniBssBodyBuilder(Object obj) {
        UniBssBody body = new UniBssBody();

        body.setData(("LOGIN_CHECK" + UniBssBody.REQ_SUBFIX).toUpperCase(), obj);

        return body;
    }

    private static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }


}
