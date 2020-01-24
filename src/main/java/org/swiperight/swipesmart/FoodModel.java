package org.swiperight.swipesmart;

import java.math.BigDecimal;

public class FoodModel {

    String name;
    BigDecimal cost;

    public void setName(String s) {
        this.name = s;
    }

    public String getName() {
        return this.name;
    }

    public void setCost(BigDecimal c) {
        this.cost = c;
    }

    public BigDecimal getCost() {
        return this.cost;
    }

}
