package com.thebrodyaga.vkobjects.users;



/**
 * Object type
 */
public enum UserFullXtrTypeType {

    PROFILE("profile");

    private final String value;

    UserFullXtrTypeType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
