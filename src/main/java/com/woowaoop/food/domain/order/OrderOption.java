package com.woowaoop.food.domain.order;

import com.woowaoop.food.domain.generic.money.Money;
import com.woowaoop.food.domain.shop.Option;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Getter
public class OrderOption {
    @Column(name="NAME")
    private String name;

    @Column(name="PRICE")
    private Money price;

    @Builder
    public OrderOption(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    public OrderOption() {
    }

    public Option convertToOption() {
        return new Option(name, price);
    }

}
