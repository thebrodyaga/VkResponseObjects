package com.thebrodyaga.vkobjects.utils;



/**
 * Link com.thebrodyaga.vkobjects.status
 */
public enum LinkCheckedStatus {

    NOT_BANNED("not_banned"),


    BANNED("banned"),


    PROCESSING("processing");

    private final String value;

    LinkCheckedStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
