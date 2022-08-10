package com.neusoft.po;

import java.util.Objects;

public class Cart {
    private Integer cartid;

    private Integer foodid;

    private Integer bid;

    private String uid;

    private Integer quantity;

    public Integer getCartid() {
        return cartid;
    }

    public void setCartid(Integer cartid) {
        this.cartid = cartid;
    }

    public Integer getFoodid() {
        return foodid;
    }

    public void setFoodid(Integer foodid) {
        this.foodid = foodid;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Cart() {
    }

    public Cart(Integer foodid, Integer bid, String uid, Integer quantity) {
        this.foodid = foodid;
        this.bid = bid;
        this.uid = uid;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartid=" + cartid +
                ", foodid=" + foodid +
                ", bid=" + bid +
                ", uid='" + uid + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cart)) return false;
        Cart cart = (Cart) o;
        return Objects.equals(cartid, cart.cartid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cartid);
    }
}