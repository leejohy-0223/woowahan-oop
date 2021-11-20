package com.woowaoop.food.domain.shop;

import com.woowaoop.food.domain.generic.money.Money;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name="SHOPS")
@Getter
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="SHOP_ID")
    private Long id;

    public boolean isOpen() {
        return false;
    }

    public boolean isValidOrderAmount(Money calculateTotalPrice) {
        return false;
    }
}
