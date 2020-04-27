package com.gcu.societyservice.entity;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

/**
 * 服务器处理结果类
 */
@Component
public class Result {
	
	private String msg;
	private Map<String, Object> extend = new HashMap<>();
	
	public static Result success(String msg) {
		Result rs = new Result();
		rs.setMsg(msg);
		return rs;
	}
	
	public static Result fail(String msg) {
		Result rs = new Result();
		rs.setMsg(msg);
		return rs;
	}
	
	public Result add(String key, Object value) {
		this.getExtend().put(key, value);
		return this;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Map<String, Object> getExtend() {
		return extend;
	}

	public void setExtend(Map<String, Object> extend) {
		this.extend = extend;
	}
}
