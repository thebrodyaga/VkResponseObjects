package com.thebrodyaga.vkobjects.users;



/**
 * Object type
 */
public enum UserXtrTypeType {

    PROFILE("profile");

    private final String value;

    UserXtrTypeType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
