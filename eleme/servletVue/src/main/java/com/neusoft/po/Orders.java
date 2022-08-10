package com.neusoft.po;

import java.math.BigDecimal;
import java.util.Objects;

public class Orders {
    private Integer oid;

    private String uid;

    private Integer bid;

    private String odate;

    private BigDecimal ott;

    private Integer daid;

    private Integer ostate;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getOdate() {
        return odate;
    }

    public void setOdate(String odate) {
        this.odate = odate;
    }

    public BigDecimal getOtt() {
        return ott;
    }

    public void setOtt(BigDecimal ott) {
        this.ott = ott;
    }

    public Integer getDaid() {
        return daid;
    }

    public void setDaid(Integer daid) {
        this.daid = daid;
    }

    public Integer getOstate() {
        return ostate;
    }

    public void setOstate(Integer ostate) {
        this.ostate = ostate;
    }

    public Orders() {
    }

    public Orders(String uid, Integer bid, String odate, BigDecimal ott, Integer daid, Integer ostate) {
        this.uid = uid;
        this.bid = bid;
        this.odate = odate;
        this.ott = ott;
        this.daid = daid;
        this.ostate = ostate;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oid=" + oid +
                ", uid='" + uid + '\'' +
                ", bid=" + bid +
                ", odate='" + odate + '\'' +
                ", ott=" + ott +
                ", daid=" + daid +
                ", ostate=" + ostate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Orders)) return false;
        Orders orders = (Orders) o;
        return Objects.equals(oid, orders.oid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oid);
    }
}