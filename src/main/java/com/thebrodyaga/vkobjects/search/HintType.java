package com.thebrodyaga.vkobjects.search;



/**
 * Object type
 */
public enum HintType {

    GROUP("group"),


    PROFILE("profile");

    private final String value;

    HintType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
