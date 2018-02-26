package com.thebrodyaga.vkobjects.groups;



/**
 * User's credentials as community admin
 */
public enum MemberRoleRole {

    MODERATOR("moderator"),


    EDITOR("editor"),


    ADMINISTRATOR("administrator"),


    CREATOR("creator");

    private final String value;

    MemberRoleRole(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
