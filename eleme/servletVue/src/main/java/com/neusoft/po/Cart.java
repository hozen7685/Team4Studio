package com.neusoft.po;

import java.util.List;
import java.util.Objects;

public class Cart {
    private Integer cartid;

    private Integer foodid;

    private Integer bid;

    private Integer uid;

    private Integer quantity;

    private Business cBusiness;

    private Food cFood;
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

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Business getcBusiness() {
        return cBusiness;
    }

    public void setcBusiness(Business cBusiness) {
        this.cBusiness = cBusiness;
    }

    public Food getcFood() {
        return cFood;
    }

    public void setcFood(Food cFood) {
        this.cFood = cFood;
    }

    public Cart() {
    }

    public Cart(Integer foodid, Integer bid, Integer uid, Integer quantity, Business cBusiness, Food cFood) {
        this.foodid = foodid;
        this.bid = bid;
        this.uid = uid;
        this.quantity = quantity;
        this.cBusiness = cBusiness;
        this.cFood = cFood;
    }

    public Cart(Integer cartid, Integer foodid, Integer bid, Integer quantity) {
        this.cartid = cartid;
        this.foodid = foodid;
        this.bid = bid;
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
                ", cBusiness=" + cBusiness +
                ", cFood=" + cFood +
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