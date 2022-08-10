package com.neusoft.po;

import java.util.Objects;

public class DeliAdd {
    private Integer daid;

    private String conname;

    private Integer consex;

    private String contel;

    private String add;

    private String uid;

    public Integer getDaid() {
        return daid;
    }

    public void setDaid(Integer daid) {
        this.daid = daid;
    }

    public String getConname() {
        return conname;
    }

    public void setConname(String conname) {
        this.conname = conname;
    }

    public Integer getConsex() {
        return consex;
    }

    public void setConsex(Integer consex) {
        this.consex = consex;
    }

    public String getContel() {
        return contel;
    }

    public void setContel(String contel) {
        this.contel = contel;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public DeliAdd() {
    }

    public DeliAdd(String conname, Integer consex, String contel, String add, String uid) {
        this.conname = conname;
        this.consex = consex;
        this.contel = contel;
        this.add = add;
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "DeliAdd{" +
                "daid=" + daid +
                ", conname='" + conname + '\'' +
                ", consex=" + consex +
                ", contel='" + contel + '\'' +
                ", add='" + add + '\'' +
                ", uid='" + uid + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DeliAdd)) return false;
        DeliAdd deliAdd = (DeliAdd) o;
        return Objects.equals(daid, deliAdd.daid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(daid);
    }
}