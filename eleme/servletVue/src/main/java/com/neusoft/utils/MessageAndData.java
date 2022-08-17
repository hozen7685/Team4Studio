package com.neusoft.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessageAndData {
    //语法构成
    private Integer statusCode;

    private String message;

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private Map<String,Object> dataZone = new HashMap<>();

    public MessageAndData add(String key,Object value){
        dataZone.put(key, value);
        return this;
    }

    public static MessageAndData success(String msg){
        MessageAndData MAD = new MessageAndData();
        MAD.setMessage(msg);
        MAD.setStatusCode(200);
        return MAD;
    }
}
