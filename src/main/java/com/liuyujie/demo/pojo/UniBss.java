package com.liuyujie.demo.pojo;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author rikugun
 * @date: 2018/9/20 15:47
 * @Description: 能力平台调用请求
 */

public class UniBss {

    @JSONField(name ="UNI_BSS_HEAD")
    private UniBssHead head;
    @JSONField(name ="UNI_BSS_BODY")
    private UniBssBody body;
    @JSONField(name ="UNI_BSS_ATTACHED")
    private JSONObject attached;


    public UniBssHead getHead() {
        return head;
    }

    public void setHead(UniBssHead head) {
        this.head = head;
    }

    public UniBssBody getBody() {
        return body;
    }

    public void setBody(UniBssBody body) {
        this.body = body;
    }

    public JSONObject getAttached() {
        return attached;
    }

    public void setAttached(JSONObject attached) {
        this.attached = attached;
    }
}