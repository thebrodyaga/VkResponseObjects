package com.thebrodyaga.vkobjects.groups;



/**
 * Information whether age limit
 */
public enum GroupFullAgeLimits {

    NO(1),


    OVER_16(2),


    OVER_18(3);

    private final Integer value;

    GroupFullAgeLimits(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
