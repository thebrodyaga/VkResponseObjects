package com.thebrodyaga.vkobjects.groups;



/**
 * Community type
 */
public enum GroupType {

    GROUP("group"),


    PAGE("page"),


    EVENT("event");

    private final String value;

    GroupType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
