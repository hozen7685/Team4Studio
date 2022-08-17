package com.neusoft.po;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class Orders {
    private Integer oid;

    private Integer uid;

    private Integer bid;

    private String odate;

    private BigDecimal ott;

    private Integer daid;

    private Integer ostate;

    private DeliAdd oDeliAdd;

    private List<Cart> oCart;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
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

    public DeliAdd getoDeliAdd() {
        return oDeliAdd;
    }

    public void setoDeliAdd(DeliAdd oDeliAdd) {
        this.oDeliAdd = oDeliAdd;
    }

    public List<Cart> getoCart() {
        return oCart;
    }

    public void setoCart(List<Cart> oCart) {
        this.oCart = oCart;
    }

    public Orders(Integer uid, Integer bid, String odate, BigDecimal ott, Integer daid, Integer ostate) {
        this.uid = uid;
        this.bid = bid;
        this.odate = odate;
        this.ott = ott;
        this.daid = daid;
        this.ostate = ostate;
    }

    public Orders() {
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
                ", oDeliAdd=" + oDeliAdd +
                ", oCart=" + oCart +
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