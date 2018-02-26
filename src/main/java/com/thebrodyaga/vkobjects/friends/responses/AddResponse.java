package com.thebrodyaga.vkobjects.friends.responses;



/**
 * Friend request com.thebrodyaga.vkobjects.status
 */
public enum AddResponse {

    SEND(1),


    APPROVED(2),


    RESEND(4);

    private final Integer value;

    AddResponse(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
