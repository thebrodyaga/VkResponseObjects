package com.thebrodyaga.vkobjects.groups;



/**
 * Callback server com.thebrodyaga.vkobjects.status
 */
public enum CallbackServerStatus {

    OK("ok"),


    WAIT("wait"),


    UNCONFIGURED("unconfigured"),


    FAILED("failed");

    private final String value;

    CallbackServerStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
