package com.thebrodyaga.vkobjects.account;



/**
 * Request com.thebrodyaga.vkobjects.status
 */
public enum NameRequestStatus {

    SUCCESS("success"),


    PROCESSING("processing"),


    DECLINED("declined"),


    WAS_ACCEPTED("was_accepted"),


    WAS_DECLINED("was_declined");

    private final String value;

    NameRequestStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
