package com.thebrodyaga.vkobjects.base.responses;



/**
 * Returns 1 if request has been processed successfully
 */
public enum OkResponse {

    OK(1);

    private final Integer value;

    OkResponse(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
