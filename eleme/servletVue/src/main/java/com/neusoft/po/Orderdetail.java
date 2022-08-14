package com.neusoft.po;

import java.util.Objects;

public class Orderdetail {
    private Integer odid;

    private Integer oid;

    public Integer getOdid() {
        return odid;
    }

    public void setOdid(Integer odid) {
        this.odid = odid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    private Orders order;

    public Orderdetail() {
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Orderdetail{" +
                "odid=" + odid +
                ", oid=" + oid +
                ", order=" + order +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Orderdetail)) return false;
        Orderdetail that = (Orderdetail) o;
        return Objects.equals(odid, that.odid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(odid);
    }
}