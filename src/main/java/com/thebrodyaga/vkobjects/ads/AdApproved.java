package com.thebrodyaga.vkobjects.ads;



/**
 * Review com.thebrodyaga.vkobjects.status
 */
public enum AdApproved {

    NOT_MODERATED(0),


    PENDING_MODERATION(1),


    APPROVED(2),


    REJECTED(3);

    private final Integer value;

    AdApproved(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
