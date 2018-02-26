package com.thebrodyaga.vkobjects.friends;



/**
 * Friend com.thebrodyaga.vkobjects.status with the user
 */
public enum FriendStatusFriendStatus {

    NOT_A_FRIEND(0),


    OUTCOMING_REQUEST(1),


    INCOMING_REQUEST(2),


    IS_FRIEND(3);

    private final Integer value;

    FriendStatusFriendStatus(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
