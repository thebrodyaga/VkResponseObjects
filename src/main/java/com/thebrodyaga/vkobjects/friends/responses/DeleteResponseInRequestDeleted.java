package com.thebrodyaga.vkobjects.friends.responses;



/**
 * Returns 1 if incoming request has been declined
 */
public enum DeleteResponseInRequestDeleted {

    OK(1);

    private final Integer value;

    DeleteResponseInRequestDeleted(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
