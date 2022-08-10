package com.neusoft.po;

import java.util.Objects;

public class Orderdetailet {
    private Integer odid;

    private Integer oid;

    private Integer foodid;

    private Integer quantity;

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

    public Integer getFoodid() {
        return foodid;
    }

    public void setFoodid(Integer foodid) {
        this.foodid = foodid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Orderdetailet() {
    }

    public Orderdetailet(Integer oid, Integer foodid, Integer quantity) {
        this.oid = oid;
        this.foodid = foodid;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Orderdetailet{" +
                "odid=" + odid +
                ", oid=" + oid +
                ", foodid=" + foodid +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Orderdetailet)) return false;
        Orderdetailet that = (Orderdetailet) o;
        return Objects.equals(odid, that.odid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(odid);
    }
}