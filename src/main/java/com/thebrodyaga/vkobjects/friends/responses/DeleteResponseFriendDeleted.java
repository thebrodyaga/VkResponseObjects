package com.thebrodyaga.vkobjects.friends.responses;



/**
 * Returns 1 if friend has been deleted
 */
public enum DeleteResponseFriendDeleted {

    OK(1);

    private final Integer value;

    DeleteResponseFriendDeleted(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
