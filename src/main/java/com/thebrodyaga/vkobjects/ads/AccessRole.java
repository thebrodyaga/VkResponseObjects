package com.thebrodyaga.vkobjects.ads;



/**
 * Current user's role
 */
public enum AccessRole {

    ADMIN("admin"),


    MANAGER("manager"),


    REPORTS("reports");

    private final String value;

    AccessRole(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
