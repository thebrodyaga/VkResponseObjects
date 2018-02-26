package com.thebrodyaga.vkobjects.ads;



/**
 * Account type
 */
public enum AccountAccountType {

    GENERAL("general"),


    AGENCY("agency");

    private final String value;

    AccountAccountType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
