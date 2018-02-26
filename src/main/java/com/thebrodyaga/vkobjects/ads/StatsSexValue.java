package com.thebrodyaga.vkobjects.ads;



/**
 * Sex
 */
public enum StatsSexValue {

    FEMALE("f"),


    MALE("m");

    private final String value;

    StatsSexValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
