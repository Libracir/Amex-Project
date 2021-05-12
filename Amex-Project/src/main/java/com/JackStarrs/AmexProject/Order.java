package com.JackStarrs.AmexProject;

public class Order {

    private long id;
    private float totalPrice;
    private int apples = 0;
    private int oranges = 0;

    public float getTotalPrice() {
        float total = 0;
        total += apples * 0.6f;
        total += oranges * 0.25f;

        return total;
    }

    public long getId () {
        return id;
    }
    public void setId (long id) {
        this.id = id;
    }
    public float getPrice () {
        return totalPrice;
    }
    public void setPrice (float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getApples() {
        return apples;
    }
    public void setApples(int apples) {
        this.apples = apples;
    }
    public int getOranges() {
        return oranges;
    }
    public void setOranges(int oranges) {
        this.oranges = oranges;
    }


}
