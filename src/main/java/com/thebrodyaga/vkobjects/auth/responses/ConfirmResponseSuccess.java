package com.thebrodyaga.vkobjects.auth.responses;



/**
 * 1 if success
 */
public enum ConfirmResponseSuccess {

    OK(1);

    private final Integer value;

    ConfirmResponseSuccess(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
