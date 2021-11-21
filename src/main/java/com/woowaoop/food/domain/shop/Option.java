package com.woowaoop.food.domain.shop;

import com.woowaoop.food.domain.generic.money.Money;
import lombok.Builder;
import lombok.Data;

@Data
public class Option {
    private String name;
    private Money price;

    @Builder
    public Option(String name, Money price) {
        this.name = name;
        this.price = price;
    }
}
