package com.thebrodyaga.vkobjects.base;



public enum Sex {


    FEMALE(1),


    MALE(2),


    UNKNOWN(0);

    private final Integer value;

    Sex(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
