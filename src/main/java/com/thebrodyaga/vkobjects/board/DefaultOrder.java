package com.thebrodyaga.vkobjects.board;



/**
 * Sort type
 */
public enum DefaultOrder {

    DESC_UPDATED(1),

    DESC_CREATED(2),

    ASC_UPDATED(-1),

    ASC_CREATED(-2);

    private final Integer value;

    DefaultOrder(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
