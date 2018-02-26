package com.thebrodyaga.vkobjects.ads;



/**
 * Cost type
 */
public enum AdLayoutCostType {

    PER_CLICKS(0),


    PER_IMPRESSIONS(1);

    private final Integer value;

    AdLayoutCostType(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
