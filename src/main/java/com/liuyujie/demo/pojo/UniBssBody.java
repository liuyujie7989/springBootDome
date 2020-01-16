package com.liuyujie.demo.pojo;


import com.alibaba.fastjson.annotation.JSONField;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rikugun
 * @date: 2018/9/20 16:15
 * @Description: ${TODO}
 */
public class UniBssBody {
	public static final String REQ_SUBFIX = "_REQ";
	public static final String RESP_SUBFIX = "_RSP";

	@JSONField(unwrapped = true)
	private Map<String, Object> data = new HashMap<>();

	public Map<String, Object> getData() {
		return data;
	}

	public void setData(String key, Object val) {
		this.data.put(key, val);
	}
}
