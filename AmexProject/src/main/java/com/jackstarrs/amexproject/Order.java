package com.jackstarrs.amexproject;

import javax.persistence.*;
import java.util.stream.Stream;

@Entity
@Table(name = "users")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private float totalPrice;
    private int apples;
    private int oranges;

    public float getTotalPrice() {
        if (apples > 1) {
            if (apples % 2 == 0) {
                apples = apples/2;
            } else {
                apples = ((apples - 1) / 2) + 1;
            }
        }
        if (oranges > 2) {
            if (oranges % 3 == 0) {
                oranges = (oranges / 3) * 2;
            } else if (oranges % 3 == 2) {
                oranges = ((oranges - 2) / 3) * 2 + 2;
            } else {
                oranges = ((oranges - 1) / 3) * 2 + 1;
            }
        }
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
