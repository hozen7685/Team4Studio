package com.neusoft.po;

import java.util.Date;
import java.util.Objects;

public class EleUser {
    private String uid;

    private String psw;

    private String username;

    private Integer sex;

    private String uphone;

    private Date uptime;

    private String userimg;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }

    public String getUserimg() {
        return userimg;
    }

    public void setUserimg(String userimg) {
        this.userimg = userimg;
    }

    public EleUser() {
    }

    public EleUser(String psw, String username, Integer sex, String uphone, Date uptime, String userimg) {
        this.psw = psw;
        this.username = username;
        this.sex = sex;
        this.uphone = uphone;
        this.uptime = uptime;
        this.userimg = userimg;
    }

    @Override
    public String toString() {
        return "EleUser{" +
                "uid='" + uid + '\'' +
                ", psw='" + psw + '\'' +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", uphone='" + uphone + '\'' +
                ", uptime=" + uptime +
                ", userimg='" + userimg + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EleUser)) return false;
        EleUser eleUser = (EleUser) o;
        return Objects.equals(uid, eleUser.uid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid);
    }
}