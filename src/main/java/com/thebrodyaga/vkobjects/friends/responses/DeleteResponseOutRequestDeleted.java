package com.thebrodyaga.vkobjects.friends.responses;



/**
 * Returns 1 if out request has been canceled
 */
public enum DeleteResponseOutRequestDeleted {

    OK(1);

    private final Integer value;

    DeleteResponseOutRequestDeleted(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
