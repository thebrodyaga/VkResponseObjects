package com.thebrodyaga.vkobjects.groups;



/**
 * Community type
 */
public enum GroupXtrInvitedByType {

    GROUP("group"),


    PAGE("page"),


    EVENT("event");

    private final String value;

    GroupXtrInvitedByType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
