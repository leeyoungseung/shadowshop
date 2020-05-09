package com.shadowshop.app.dto;

import java.io.Serializable;

public class BaseDTO implements Serializable{
	
	String resMsg;
	String errMsg;
	
	public String getResMsg() {
		return resMsg;
	}
	public void setResMsg(String resMsg) {
		this.resMsg = resMsg;
	}
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	
	@Override
	public String toString() {
		return "BaseDTO [resMsg=" + resMsg + ", errMsg=" + errMsg + "]";
	}
	
	
}
