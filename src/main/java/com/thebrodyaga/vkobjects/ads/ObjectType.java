package com.thebrodyaga.vkobjects.ads;



/**
 * Object type
 */
public enum ObjectType {

    AD("ad"),


    CAMPAIGN("campaign"),


    CLIENT("client"),


    OFFICE("office");

    private final String value;

    ObjectType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
