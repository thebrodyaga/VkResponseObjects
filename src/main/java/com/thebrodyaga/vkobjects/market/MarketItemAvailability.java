package com.thebrodyaga.vkobjects.market;



/**
 * Information whether the item is available
 */
public enum MarketItemAvailability {

    AVAILABLE(0),


    REMOVED(1),


    UNAVAILABLE(2);

    private final Integer value;

    MarketItemAvailability(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
