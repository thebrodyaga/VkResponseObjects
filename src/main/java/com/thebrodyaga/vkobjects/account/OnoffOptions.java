package com.thebrodyaga.vkobjects.account;



/**
 * Settings parameters
 */
public enum OnoffOptions {

    ON("on"),


    OFF("off");

    private final String value;

    OnoffOptions(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
