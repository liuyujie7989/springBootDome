package com.liuyujie.demo.pojo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * @author rikugun
 * @date: 2018/9/20 16:12
 * @Description: 能力平台请求头
 * <pre>
 *     名称
 * 类型
 * 必填?
 * 说明
 * 备注
 * APP_ID
 * varchar
 * Y
 * 接入标识码
 *
 *
 * TIMESTAMP
 * timestamp
 * Y
 * 时间戳
 * 当前的系统时间戳，单位为毫秒
 * TRANS_ID
 * char(32)
 * Y
 * 序列号
 * YYYYMMDDHHMMSS+毫秒(3) +6位随机数
 * TOKEN
 * varchar(32)
 * Y
 * 访问令牌
 *
 *
 * RESERVED
 * 数组
 * N
 * 保留字段
 * </pre>
 */

public class UniBssHead {

	@JSONField(name = "APP_ID")
	private String appId;
	@JSONField(name = "TIMESTAMP")
	private Long timestamp;
	@JSONField(name = "TRANS_ID")
	private String transId;
	@JSONField(name = "TOKEN")
	private String token;
	@JSONField(name = "RESP_CODE")
	private String respCode;
	@JSONField(name = "RESP_DESC")
	private String respDesc;
	@JSONField(name = "RESERVED")
	private List<Object> reserved;

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getTransId() {
		return transId;
	}

	public void setTransId(String transId) {
		this.transId = transId;
	}

	public String getRespCode() {
		return respCode;
	}

	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}

	public String getRespDesc() {
		return respDesc;
	}

	public void setRespDesc(String respDesc) {
		this.respDesc = respDesc;
	}

	public List<Object> getReserved() {
		return reserved;
	}

	public void setReserved(List<Object> reserved) {
		this.reserved = reserved;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
}
