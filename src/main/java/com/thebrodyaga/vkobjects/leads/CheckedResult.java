package com.thebrodyaga.vkobjects.leads;



/**
 * Information whether user can start the lead
 */
public enum CheckedResult {

    TRUE("true"),


    FALSE("false");

    private final String value;

    CheckedResult(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
