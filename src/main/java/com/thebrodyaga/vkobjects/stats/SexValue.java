package com.thebrodyaga.vkobjects.stats;



/**
 * Sex value
 */
public enum SexValue {


    FEMALE("f"),


    MALE("m");

    private final String value;

    SexValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
