package com.thebrodyaga.vkobjects.base;



public enum PropertyExists {

    PROPERTY_EXISTS(1);

    private final Integer value;

    PropertyExists(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
