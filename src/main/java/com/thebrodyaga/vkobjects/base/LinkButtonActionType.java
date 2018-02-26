package com.thebrodyaga.vkobjects.base;



/**
 * LinkButtonAction type
 */
public enum LinkButtonActionType {


    OPEN_URL("open_url");

    private final String value;

    LinkButtonActionType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
