package com.thebrodyaga.vkobjects.groups;



/**
 * Level of current user's credentials as manager
 */
public enum GroupXtrInvitedByAdminLevel {

    MODERATOR(1),


    EDITOR(2),


    ADMINISTRATOR(3);

    private final Integer value;

    GroupXtrInvitedByAdminLevel(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
