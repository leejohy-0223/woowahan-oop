package com.woowaoop.food.domain.order;

import com.woowaoop.food.domain.generic.money.Money;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name="ORDER_LINE_ITEM")
@Getter
public class OrderLineItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ORDER_LINE_ITEM_ID")
    private Long id;


    public void validate() {

    }

//    public Money calculatePrice() {
//        return Money.sum(groups, OrderOptionGroup::calculatePrice).times(count);
//    }
}
