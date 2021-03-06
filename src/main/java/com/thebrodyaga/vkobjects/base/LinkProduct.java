package com.thebrodyaga.vkobjects.base;


import com.thebrodyaga.vkobjects.market.Price;

import java.util.Objects;

/**
 * LinkProduct object
 */
public class LinkProduct {

    private Price price;

    public Price getPrice() {
        return price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkProduct linkProduct = (LinkProduct) o;
        return Objects.equals(price, linkProduct.price);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LinkProduct{");
        sb.append("price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
