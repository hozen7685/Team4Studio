package com.neusoft.po;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Business {
    private Integer bid;

    private String bname;

    private String badd;

    private String binfo;

    private Integer ordertypeid;

    private BigDecimal startprice;

    private BigDecimal deliprice;

    private String remarks;

    private String bimg;

    private List<Food> bFoods;

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBadd() {
        return badd;
    }

    public void setBadd(String badd) {
        this.badd = badd;
    }

    public String getBinfo() {
        return binfo;
    }

    public void setBinfo(String binfo) {
        this.binfo = binfo;
    }

    public Integer getOrdertypeid() {
        return ordertypeid;
    }

    public void setOrdertypeid(Integer ordertypeid) {
        this.ordertypeid = ordertypeid;
    }

    public BigDecimal getStartprice() {
        return startprice;
    }

    public void setStartprice(BigDecimal startprice) {
        this.startprice = startprice;
    }

    public BigDecimal getDeliprice() {
        return deliprice;
    }

    public void setDeliprice(BigDecimal deliprice) {
        this.deliprice = deliprice;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getBimg() {
        return bimg;
    }

    public void setBimg(String bimg) {
        this.bimg = bimg;
    }

    public List<Food> getbFoods() {
        return bFoods;
    }

    public void setbFoods(List<Food> bFoods) {
        this.bFoods = bFoods;
    }

    public Business() {
    }

    public Business(String bname, String badd, String binfo, Integer ordertypeid, BigDecimal startprice, BigDecimal deliprice, String remarks, String bimg, List<Food> bFoods) {
        this.bname = bname;
        this.badd = badd;
        this.binfo = binfo;
        this.ordertypeid = ordertypeid;
        this.startprice = startprice;
        this.deliprice = deliprice;
        this.remarks = remarks;
        this.bimg = bimg;
        this.bFoods = bFoods;
    }

    @Override
    public String toString() {
        return "Business{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                ", badd='" + badd + '\'' +
                ", binfo='" + binfo + '\'' +
                ", ordertypeid=" + ordertypeid +
                ", startprice=" + startprice +
                ", deliprice=" + deliprice +
                ", remarks='" + remarks + '\'' +
                ", bimg='" + bimg + '\'' +
                ", bFoods=" + bFoods +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Business)) return false;
        Business business = (Business) o;
        return bid.equals(business.bid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bid);
    }
}