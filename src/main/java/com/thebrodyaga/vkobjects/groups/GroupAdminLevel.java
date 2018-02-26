package com.thebrodyaga.vkobjects.groups;



/**
 * Level of current user's credentials as manager
 */
public enum GroupAdminLevel {

    MODERATOR(1),


    EDITOR(2),


    ADMINISTRATOR(3);

    private final Integer value;

    GroupAdminLevel(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
