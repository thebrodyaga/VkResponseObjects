package com.thebrodyaga.vkobjects.base;



public enum BoolInt {

    NO(0),


    YES(1);

    private final Integer value;

    BoolInt(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
